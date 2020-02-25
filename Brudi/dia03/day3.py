import os.path as path

def get_coordenadas(x,y,char):
    """Obtener las coordenadas en funcion del caracter pasado.

    Parámetros:
    x -- coordenada x actual
    y -- coordenada y actual
    char -- instrucción simple del elfo

    Return:
    (x,y) -- cordenada resultante al realizar la accion del caracter char

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

def get_houses_with_presents(txt):
    """Obtener el número de casas que al menos tiene un regalo.

    Parámetros:
    txt -- fichero que contiene las direcciones del elfo

    Return:
    len(posiciones) -- int

    """
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

print("El número de casas que tienen al menos un regalo son: "+str(get_houses_with_presents('day3/input.txt')))





