#Day 1
##Part 1
Para la resolver esta parte he tenido que crear esta función:
````
def get_number_floor(txt):
    f = open(txt, "r")
    count=0
    for line in f:
        for char in line:
            if(char=="("):
                count=count+1
            elif(char==")"):
                count=count-1
    return count
````
Se encarga de contar el número de pisos, para ello lo que se ha realizado es un contador en el cual, se va
a incrementar cada vez que se encuentra el carácter '(' y se va decrementar por cada carácter ')' y finalmente devolverá
 el valor del contador.
La función tiene como parámetro la ruta del txt de input, el cual contiene los caracteres que queremos calcular y este devolverá
un entero, el cual será el valor numérico del piso


##Part 2
Para la resolver esta parte he creado esta función:
````
def get_position(txt):
    f = open(txt, "r")
    count=0
    for line in f:
        for i in range(len(line)):
            if(line[i]=="("):
                count=count+1
            elif(line[i]==")"):
                count=count-1
            if(count<0):
                return i+1
````
Esta función se encarga de coger el fichero de texto y leer los caracteres y decir en qué momento se ha llegado al sótano,
 el cual es el momento en que este valor es un número negativo, para ello se ha tenido que realizar el mismo procedimiento que 
 la función de la parte 1, pero añadiéndole una condición de si el valor es negativo devuelve la posición del caracter+1.  
La función tiene como parámetro la ruta del txt de input, el cual contiene los caracteres que queremos calcular y este devolverá
un entero será la posición del carácter en el que se bajó por primera vez al sótano.
