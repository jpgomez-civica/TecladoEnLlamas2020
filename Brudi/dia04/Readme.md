#Day 3
##Part 1
Para la resolver esta parte he tenido que crear esta función:
````
def get_hash_md5(psw):
    hash="AAAAAAAAAAAAAAA"
    i=0
    while(hash[:5]!="00000"):
        pasw=psw+str(i)
        hash = hashlib.md5(pasw.encode()).hexdigest()
        i=i+1
    return i-1
````
Esta función tiene de entrada la clave secreta, y lo que se encarga de llamar a la función md3 de la librería hashlib, 
la cual crea el hash md5 del string pasado por parámetro. Por lo tanto, lo que realizo es añadirle a la entrada un valor 
numérico que esta inicializado a 0 y va incrementando hasta que el hash md5 generado empiece por 5 0s.  
Cuando ocurre tal condición para el bucle y se devuelve el valor numérico que le hemos añadido al final de la clave secreta.

##Part 2
Para la resolver esta parte se ha realizado una breve modificación de la anterior función:

````
def get_hash_md5(psw):
    hash="AAAAAAAAAAAAAAA"
    i=0
    while(hash[:6]!="000000"):
        pasw=psw+str(i)
        hash = hashlib.md5(pasw.encode()).hexdigest()
        i=i+1
    return i-1
````
La modificación que se ha realizado es el bucle pare cuando el hash md5 generado empiece por 6 0s.

