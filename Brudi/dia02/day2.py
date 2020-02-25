import os.path as path

def square_feet_to_wrapping_paper(txt):
    """Pasar de caja a metros de papel.

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
            mult=[medidas[0]*medidas[1],medidas[1]*medidas[2],medidas[2]*medidas[0]]
            sum=sum+(2*mult[0])+(2*mult[1])+(2*mult[2])+min(mult)
        f.close()
        return sum
    else:
        print("El fichero no existe")
        return -1

print("El tamaño del papel es : "+str(square_feet_to_wrapping_paper('input.txt')))





