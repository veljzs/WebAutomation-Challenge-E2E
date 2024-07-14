1. Prerequisitos:
	- Maquina local con el sistema operativo Windows 11
	- IDE IntelliJ version 2024.1.3
	- Maven version  3.9.8 (debe estar en la variable de entorno)
	- JDK versión 11 (debe estar en la variable de entorno)

2. Comandos de instalación
	- mvn install -DskipTests (descarga todas las dependencias del POM)
	- npm install (descarga todas los package de mi package.json)	

3. Instrucciones para ejecutar los test
  Ejecutar test:
  - Ir a la carpeta runner dentro de src/test/java/com.challenge
  -Seleccionar CucumberTestSuite
  -Correr el test en la linea de CucumberTestSuite
  Generar Reporte
  -Ir a terminal y ejecutar el comando:  mvn serenity:aggregate
  -Dar link en el link Full Report para abrirlo o ir a target/site dar click derecho en index.html y elegir el browser donde abrirlo.

