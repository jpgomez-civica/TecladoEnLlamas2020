import hashlib


def get_hash_md5(psw):
    """Obtener el número para que la hash generada empieze con 6 0s.

    Parámetros:
    psw -- clave secreta para generar el hash md5

    Return:
    i-1 -- int

    """
    hash="AAAAAAAAAAAAAAA"
    i=0
    while(hash[:6]!="000000"):
        pasw=psw+str(i)
        hash = hashlib.md5(pasw.encode()).hexdigest()
        i=i+1
    return i-1

psw = "bgvyzdsv"
print("El número para generar el hash md5 es : "+str(get_hash_md5(psw)))