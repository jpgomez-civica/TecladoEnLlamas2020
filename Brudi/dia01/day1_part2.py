def get_position(txt):
    """Obtiene la posicion cuando se va al sotano.

    Parámetros:
    txt -- fichero que contiene los ()

    Return:
    count -- int

    """
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

print("La posicion en la que bajo al sótano es  : "+str(get_position('input.txt')))