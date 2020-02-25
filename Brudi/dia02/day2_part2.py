import os.path as path

def square_feet_to_ribbon_paper(txt):
    """Pasar de caja a metros de cinta.

    Parámetros:
    txt -- fichero que contiene las medidas de cada regalo

    Return:
    sum -- int

    """
    if path.exists(txt):
        f = open(txt, "r")
        sum=0
        for line in f:
            medidas=line.split('x')
            medidas=list(map(int, medidas))
            medidas.sort()
            sum=sum+(medidas[0]*2)+(medidas[1]*2)+(medidas[0]*medidas[1]*medidas[2])
        f.close()
        return sum
    else :
        print("El fichero no existe")
        return -1

print("El tamaño de la cinta es : "+str(square_feet_to_ribbon_paper('input.txt')))

