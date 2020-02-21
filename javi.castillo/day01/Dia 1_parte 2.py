

print ("Introduce la entrada:")
in_entrada=input()
contador=0
i=0
for i in range(0, len(in_entrada)):
    if in_entrada[i] == "(" :
        contador=contador+1
    elif in_entrada[i] == ")" :
        contador=contador-1
    if contador < 0 :
        break

print("Santa baja por debajo del suelo en la posicion " + str(i+1) )
