import os.path as path

def get_coordenadas(x,y,char):
    """Obtener las coordenadas en funcion del caracter pasado.

    Parámetros:
    x -- coordenada x actual
    y -- coordenada y actual
    char -- instrucción simple del elfo

    Return:
    (x,y) -- cordenada final al leer el caracter

    """
    if(char=='v'):
        y=y-1
    elif(char=='>'):
        x=x+1
    elif(char=='<'):
        x=x-1
    elif(char=='^'):
        y=y+1
    return (x,y)


def get_houses_with_presents_v2(txt):
    """Obtener el número de casas que al menos tiene un regalo teniendo en cuenta que repartiran regalos Papa Noel y Robot Noel.

    Parámetros:
    txt -- fichero que contiene las direcciones del elfo

    Return:
    len(posiciones) -- int

    """
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

print("El número de casas que tienen al menos un regalo son: "+str(get_houses_with_presents_v2('day3/input.txt')))
