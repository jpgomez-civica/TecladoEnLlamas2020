#
def get_number_floor(txt):
    """Cuenta el numero de piso.

    Parámetros:
    txt -- fichero que contiene los ()

    Return:
    count -- int

    """
    f = open(txt, "r")
    count=0
    for line in f:
        for char in line:
            if(char=="("):
                count=count+1
            elif(char==")"):
                count=count-1
    return count

print("El piso que se encuentra es  : "+str(get_number_floor('input.txt')))





