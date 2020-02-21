# Solución Día 1

Para la solución del día 1 he utilizado Angular.

## Compilación
Basta con ejecutar el comando *npm install* en el directorio del 'package.json'. Y una vez instalados los módulos ejecutar *ng serve*.

## Estructura
Antes de nada, sólo hay una carpeta source, ya que utilizo el mismo programa para dar salida a las dos soluciones.

He creado un servicio *input.service* que mediante una llamada 'Get' al archivo local (situado en **assets/resources/input.txt**) obtiene el contenido del mismo. Posteriormente en la clase principal *app.component*se realiza el procesamiento de la información para aportar las dos soluciones.  