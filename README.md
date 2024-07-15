# Proyecto de Automatización Web E2E

## Prerrequisitos
- **IDE:** IntelliJ versión 2024.1.3
- **Maven:** versión 3.9.1 (debe estar configurado en la variable de entorno)
- **JDK:** versión 11 (debe estar configurado en la variable de entorno)

## Comandos de Instalación
- Ejecutar: `mvn install -DskipTests` (esto descarga todas las dependencias del POM)

## Instrucciones para Ejecutar las Pruebas
1. **Verificar el JDK:**
   - Asegúrate de que IntelliJ esté usando JDK 11.
   - Ve a `File` > `Project Structure`, selecciona `Project` en `Project Settings` y confirma que el `SDK` sea `java version 11`.

2. **Preparar el Entorno:**
   - Si deseas generar un reporte, asegúrate de que la carpeta `target` no exista en el directorio del proyecto. Si existe, ejecuta `mvn clean` en la terminal.

3. **Ejecutar la Suite de Pruebas:**
   - Navega a `src/test/java/com.challenge/runners/CucumberTestSuite.java`.
   - Ejecuta las pruebas desde la línea de **CucumberTestSuite**.

### Generar Reporte

Después de ejecutar las pruebas:

1. Abre la Terminal y ejecuta: `mvn serenity:aggregate`.
2. Selecciona el enlace **Full Report** que aparece al final de la ejecución del comando.
3. También puedes ir a `target/site/serenity/index.html`, hacer clic derecho en el archivo y seleccionar "Abrir en" para elegir el navegador en el que deseas ver el reporte.