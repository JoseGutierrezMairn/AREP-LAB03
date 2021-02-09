# Heroku app
En este laboratorio se busca desplegar en heroku el programa que realizamos en el laboratorio pasado, es decir, el programa de la calculadora
que calcula la media y la derivación estándar de un grupo de números.
### Prerrequisitos
Debemos tener los siguientes programas instalados:
~~~
* Maven
* Git
* Java
~~~
# Instalando 
Para descargar el proyecto realizaremos los siguientes pasos desde el **Simbolo del sistema** o **Command prompt**:  
1. Nos dirigimos a la ubicación donde queremos descargar el proyecto desde el simbolo del sistema.  
2. Escribimos el siguiente comando para realizar la descarga:  
`git clone https://github.com/JoseGutierrezMairn/AREP-Lab01.git`
3. Esperamos a que el simbolo de sistema nos diga que ya se realizó la descarga  
![Download completed](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img1.PNG?raw=true)
4. El proyecto ya se encuentra en nuestros computadores y está listo para ser editado o probado.  
  
#Probando
Para probar el proyecto podemos correr las pruebas que se encuentran en la carpeta `\arep-lab01\src\test\java\edu\escuelaing\arep\app\AppTest.java`  
usando maven podemos correr las pruebas mencionadas digitando desde la linea de comandos situados dentro de la carpeta **arep-lab01**
`mvn test`
![Pruebas desde maven](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img2.PNG?raw=true)  
Las pruebas que se encuentran en el proyecto tienen la finalidad de validar la funcionalidad de cada clase existente en el proyecto en este caso:
~~~
* Reader
* JoseLinkedList
* Calculator
* Node
* App
~~~
Para generar el javadoc ejecutamos el siguiente codigo desde la consola dentro de la carpeta **arep-lab01**: `mvn javadoc:javadoc`  
![generando javadoc](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img3.PNG?raw=true)  
![generando javadoc2](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img4.PNG?raw=true)  
Podemos consultar la documentación generada el archivo: `\arep-lab01\target\site\apidocs`  
*Este es un ejemplo de como se ve la documentación generada en este proyecto*
![check javadoc2](https://github.com/JoseGutierrezMairn/AREP-Lab01/blob/master/images/img5.PNG?raw=true) 
# Heroku  
Para probar el programa desplegado en heroku  
seguir el siguiente link:  
[Calculadora - Jose Gutierrez Marin](https://pure-woodland-27738.herokuapp.com/calculadora)
# CircleCI
[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/JoseGutierrezMairn/AREP-HEROKU-LAB02)  

# Desarrollo  
Construido con:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [CircleCI](https://circleci.com/)
* [Heroku](https://dashboard.heroku.com/)
# Autor
* [Jose Gutierrez](https://github.com/JoseGutierrezMairn)
