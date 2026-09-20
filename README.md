# Sunna Icor — mod de Fabric para Minecraft 26.2 (Chaos Cubed)

Armadura Sunna Icor: usa tu modelo y textura exportados de Blockbench,
con las siguientes habilidades:

- **Inmunidad total a fuego y lava** mientras llevas puesto el set completo
  (casco + peto + pantalones + botas).
- **Explosión defensiva cada 4 golpes recibidos**: al recibir el 4º golpe de
  un jugador o mob, se genera una explosión centrada en quien te atacó. No
  te daña a ti (el portador de la armadura), pero sí a tu agresor y a
  cualquier otra entidad cercana. No destruye bloques.
- **Protección altísima y "casi indestructible"**: defensa muy por encima de
  netherite (37 puntos entre las 4 piezas), toughness 6.0, resistencia al
  retroceso 0.5, y durabilidad base de 900 (netherite usa 37) — dura
  muchísimo, pero sigue siendo un número finito, no infinito.

## ⚠️ IMPORTANTE: esto es código fuente, NO un .jar

Esta carpeta (y el .zip que la contiene) es el **código fuente** del mod.
Un mod de Minecraft es un archivo `.jar` con **código ya compilado**
(archivos `.class`), no archivos `.java` sin compilar. **No renombres esta
carpeta ni el .zip a `.jar`** — Minecraft no lo va a abrir, porque
literalmente no es un jar, es texto fuente. Necesitas *compilarlo* primero
(ver abajo) para obtener el `.jar` real.

## Cómo obtener el .jar compilado (recomendado: GitHub Actions)

Este proyecto incluye un workflow de GitHub Actions
(`.github/workflows/build.yml`) que compila el mod automáticamente en los
servidores de GitHub — ahí sí hay acceso completo a Mojang y Fabric, así
que no necesitas instalar nada en tu computadora. Pasos:

1. Crea un repositorio nuevo en [github.com/new](https://github.com/new)
   (puede ser público o privado, no importa el nombre).
2. Sube el contenido de esta carpeta a ese repositorio. La forma más fácil
   sin usar la terminal: en la página del repo, botón **"Add file" →
   "Upload files"**, arrastra TODOS los archivos y carpetas de este
   proyecto (incluyendo la carpeta oculta `.github`), y dale **Commit
   changes**.
3. Ve a la pestaña **"Actions"** del repositorio. Debería aparecer una
   ejecución llamada "Compilar mod Sunna Icor" corriendo sola (o dale clic
   en "Run workflow" si no arrancó).
4. Espera a que termine (unos 3-5 minutos) y te salga la palomita ✅ verde.
5. Entra a esa ejecución y, hasta abajo, en la sección **"Artifacts"**,
   descarga **"Sunna-Icor-mod-jar"**. Eso descarga un `.zip`.
6. Descomprime ese `.zip` — adentro está el **.jar real y compilado**
   (algo como `sunna_icor-1.0.0.jar`). Ese es el que va a la carpeta `mods`
   de tu instalación de Fabric Loader para Minecraft 26.2.

Si el paso 4 sale con una ❌ roja en vez de palomita, dale clic para ver el
error y pégamelo aquí — así lo arreglo en el código.

## Alternativa: compilar en tu propia PC

Si prefieres no usar GitHub, necesitas instalar **JDK 25** y **Gradle**
(no el wrapper — usa el comando `gradle` directo) en tu computadora, y
correr, dentro de esta carpeta:

```bash
gradle build
```

El `.jar` resultante queda en `build/libs/sunna_icor-1.0.0.jar`. Ese es el
que copias a la carpeta `mods`.

## Cómo probar en desarrollo

```bash
gradle runClient
```

## Estructura del proyecto

```
src/main/java/com/sunnaicor/
  SunnaIcor.java              -> entrypoint principal (registra todo)
  item/SunnaIcorArmorMaterial.java  -> stats de la armadura (defensa, toughness, durabilidad)
  item/ModItems.java           -> registro de las 4 piezas
  attachment/ModAttachments.java   -> contador de golpes por jugador
  event/SunnaIcorEvents.java   -> inmunidad a fuego/lava + explosión cada 4 golpes
  util/SunnaIcorUtil.java      -> helpers para comprobar si lleva el set puesto

src/client/java/com/sunnaicor/client/
  SunnaIcorClient.java         -> entrypoint de cliente (renderer + modelos)
  model/SunnaIcor*Model.java   -> los 4 modelos exportados de Blockbench, adaptados a 26.2

src/main/resources/
  fabric.mod.json
  assets/sunna_icor/...        -> texturas, iconos de item, modelos, idiomas
  data/sunna_icor/tags/item/... -> tag de reparación en yunque
```

## Ajustar el balance

Todo lo relacionado a stats de la armadura vive en un solo lugar:
`item/SunnaIcorArmorMaterial.java` (durabilidad, defensa, toughness,
resistencia al retroceso). La lógica de la explosión (radio, daño, golpes
necesarios) está al inicio de `event/SunnaIcorEvents.java` en constantes
fáciles de cambiar:

```java
private static final int HITS_TO_TRIGGER = 4;
private static final double EXPLOSION_RADIUS = 3.5D;
private static final float EXPLOSION_MAX_DAMAGE = 9.0F;
private static final double EXPLOSION_KNOCKBACK = 1.35D;
```

Por defecto, las habilidades (inmunidad a fuego/lava y explosión) requieren
el **set completo** de 4 piezas. Si prefieres que baste con tener puesto
solo el peto, cambia `hasArmorPowers` en `util/SunnaIcorUtil.java` para que
llame a `isWearingChestplate` en vez de `isWearingFullSet`.

## Notas sobre Minecraft 26.2

Este proyecto usa las APIs actuales de Minecraft 26.2 (Chaos Cubed,
junio 2026), que difieren de versiones anteriores en varios puntos
importantes que se tuvieron en cuenta al adaptar tus archivos originales de
Blockbench (hechos para "1.17 o superior"):

- El juego ya no está ofuscado desde la 26.1 (mappings oficiales de Mojang
  incluidos directamente), así que el build no declara una línea
  `mappings` como en versiones viejas.
- `EntityModel#renderToBuffer` cambió su firma: en vez de recibir 4 floats
  de color (r, g, b, a) recibe un solo `int color` empaquetado. Los 4
  modelos fueron actualizados para usar la firma nueva.
- El sistema de armadura usa `ArmorMaterial` + `EquipmentAsset` en vez del
  viejo enum de materiales.
- `CreativeModeTabEvents` reemplaza al antiguo `ItemGroupEvents`.

## Iconos y texturas de item

Los iconos de 16×16 para el inventario (`textures/item/*.png`) fueron
generados a partir de la paleta de colores de tu textura de armadura
(dorado/plateado con acentos azules) como placeholder. Si quieres iconos
de item hechos a mano en vez de estos, reemplaza esos 4 archivos PNG — el
resto del mod no necesita cambios.
