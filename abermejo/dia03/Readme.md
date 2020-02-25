### Día 3

- La solucion la obtengo manejando las direcciones en dos planos -> X e Y. Guardo en un diccionario cuya key es la dirección (Struct con x:Int , y:Int) y el valor del diccionario es el número de veces que se pasó por esa ubicación. Basta con contar el diccionario para saber las direcciones distintas.
- Como agregado, casi todo el código es genérico, flexible a cambios.
- En vez de realizarlo en Go como los anteriores, esta vez lo hice en Swift 5.1, que tiene algunas características interesantes en manejo de Opcionales y métodos de extensión que usé.
- Se puede probar el código en http://online.swiftplayground.run/ en caso de no tener Mac o XCode.
- Igual que en la anterior, también añadí medición de tiempo de ejecución, esta vez, se mueve en torno a los 2 - 5 ms.