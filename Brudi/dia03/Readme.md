#Day 3
##Part 1
Para la resolver las dos partes del día 3 he tenido que crear esta función general:Para la resolver las dos partes del 
día 3 he tenido que crear esta función general:
````
import os.path as path

def get_coordenadas(x,y,char):
    if(char=='v'):
        y=y-1
    elif(char=='>'):
        x=x+1
    elif(char=='<'):
        x=x-1
    elif(char=='^'):
        y=y+1
    return (x,y)
````
Esta función tiene de entrada un char y las coordenadas x e y, con lo que actualiza estas coordenadas, dependiendo del 
char de entrada, es decir, si el char es 'V' eso significa que va a bajar, por lo tanto, disminuyo la coordenada actual y, 
lo mismo ocurre cuando se mueve a la derecha, la cual es el carácter '>', que corresponde a incrementar el valor x.  
Por lo tanto, para resolver este reto se va a usar se va a combinar la anterior función con esta:
````
def get_houses_with_presents(txt):
    if path.exists(txt):
        f = open(txt, "r")
        posiciones=[]
        x=0
        y=0
        for line in f:
            for i in range(len(line)):
                char=line[i]
                posicion_str=get_coordenadas(x,y,char)
                x,y=posicion_str[0],posicion_str[1]
                if(posicion_str not in posiciones):
                    posiciones.append(posicion_str)
        f.close()
        return len(posiciones)
    else:
        print("El fichero no existe")
        return -1
````
Esta función lo que se encarga es de coger de entrada el fichero de texto, y primero verificar que este fichero existe 
sino devolverá una salida notificándolo en pantalla y el valor -1.  
Luego se va a inicializar una lista llamada posiciones, la cual va estar vacía y también se va a inicializar a 0 unas 
coordenadas x e y. Si la ruta del fichero es correcta se llamará a la función get_coordenadas, con cada carácter que contiene 
el fichero y con los respectivos x e y que se irán actualizando por cada vez que se llama a esta función.  
Luego obteniendo las coordenadas actualizadas por cada acción realizada se meterán en la lista posiciones, solamente si 
esta coordenada no existe en la lista, por lo tanto, esta lista contendrá las coordenadas sin repetir en las que se ha entregado
 los regalos, con lo que el tamaño del vector no dirá las casas que le han llegado al menos un regalo.

##Part 2
Para la resolver esta parte se ha realizado una breve modificación de la anterior función:
````
def get_houses_with_presents_v2(txt):
    if path.exists(txt):
        f = open(txt, "r")
        posiciones=[]
        x_santa=0
        y_santa=0
        x_robo_santa=0
        y_robo_santa=0
        for line in f:
            for i in range(len(line)):
                char=line[i]
                if(i%2==0):
                    posicion_str=get_coordenadas(x_santa,y_santa,char)
                    x_santa,y_santa=posicion_str[0],posicion_str[1]
                else:
                    posicion_str=get_coordenadas(x_robo_santa,y_robo_santa,char)
                    x_robo_santa,y_robo_santa=posicion_str[0],posicion_str[1]
                if(posicion_str not in posiciones):
                    posiciones.append(posicion_str)
        f.close()
        return len(posiciones)
    else:
        print("El fichero no existe")
        return -1
````
Esta modificación que se ha realizado, respecto a la función a anterior, es que ahora tendremos almacenadas unas coordenadas 
x e y para santa y otras x e y para el robot de santa, con lo que se repetirá todo el procedimiento mencionado anteriormente,
 pero la entrada x e y de la función get_coordenadas ira alternando por cada instrucción una vez con las coordenadas de santa y
  para la siguiente instrucción con el robot de santa.
