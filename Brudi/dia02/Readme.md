#Day 2
##Part 1
Para la resolver esta parte he tenido que crear esta función:
````
def square_feet_to_wrapping_paper(txt):
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
````
Se encarga de coger las medidas de cada caja y separar la línea LxWxH por el valor x y así se nos queda en una lista con 
L W y H y a partir de esto se realiza estos cálculos y se almacenan en esta lista [l*w,w*h,h*l] y a partir de esta lista
 se realiza el cálculo de 2*l*w + 2*w*h + 2*h*l y además sumándole el mínimo de la lista. Finalmente, esta suma se almacena
  en la variable sum, la cual se va a acumular por cada caja.  
Esta función tiene como entrada el txt que contiene las medidas de cada caja y este devolverá un entero con el valor de 
metros de papel que es necesario para esas cajas.

##Part 2
Para la resolver esta parte he creado esta función:
````
def square_feet_to_ribbon_paper(txt):
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
````
Se encarga de coger las medidas de cada caja y separar la línea LxWxH por el valor x y así se nos queda una lista con 
L W y H. Esta lista se ordena de forma ascendiente y así nos quedamos con los valores más pequeños y realizamos el cálculo 
de Ax2+Bx2, siendo A y B los dos valores más pequeños. A este cálculo se le suma la multiplicación de las 3 medidas de la caja 
y se almacena en sum, el cual se va acumular por cada caja.  
Esta función tiene como entrada el txt que contiene las medidas de cada caja y este devolverá un entero con el valor de metros 
de cinta que es necesario para esas cajas.
