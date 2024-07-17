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
   - Si deseas generar un reporte, antes de correr los tests asegúrate de que la carpeta `target` no exista en el directorio del proyecto. Si existe, ejecuta `mvn clean` en la terminal.

3. **Ejecutar las Pruebas:**
   - Navega a `src/test/java/com.challenge/runners/CucumberTestSuite.java`.
   - Ejecuta la prueba dando clic derecho en `CucumberTestSuite.java` y seleccionando `Run 'CucumberTestSuite'`.
   - También puedes ejecutar el `CucumberTestSuite.java` abriendo el archivo y dando clic en el botón de play verde a la izquierda de la línea `public class CucumberTestSuite` y seleccionando la opción `Run 'CucumberTestSuite'`. O dando clic derecho dentro del archivo y seleccionando `Run 'CucumberTestSuite'`.

### Generar Reporte

Después de ejecutar las pruebas:

1. Abre la Terminal y ejecuta: `mvn serenity:aggregate`.
2. Una vez ejecutado el comando, copia el enlace **Full Report** que aparece al final de la ejecución y pégalo en el navegador para abrir el reporte.
3. También puedes ir a `target/site/serenity/index.html`, dar clic derecho en el archivo, seleccionar "Abrir con" y elegir el navegador donde deseas ver el reporte. Este archivo se creará una vez ejecutado el comando detallado en el paso 1.





