import hashlib 
  

cadena_inicial = "yzbqklnj"
  
for i in range(1000000):
    resultado = hashlib.md5((cadena_inicial + str(i)).encode()).hexdigest()
    if resultado[:5] == '00000':
        print("El número más bajo que genera un MD5 solicitado es: ", end="")
        print(i)
        break

