

print ("Introduce la entrada:")
in_entrada=input()

var_n_arriba=in_entrada.count("(")
var_n_abajo=in_entrada.count(")")

out_planta=str(var_n_arriba-var_n_abajo)

print("Santa está en la " + out_planta + " planta.")



