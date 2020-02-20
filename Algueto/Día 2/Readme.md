Para resolver el primer apartado lo primero que hago es convertir el string de las dimensiones de cada regalo a 
un array separando por ("\r\n").Luego recorro ese array y creo otro que va a tener las tres dimensiones de un solo regalo separando 
por (x).Luego creo un List donde introduzco los tres calculos para calcular el area que han sido calculada previamente
(dimension1=largo*ancho,dimension2=ancho*alto,dimension3=ancho*alto) y los ordeno de menor a mayor para obtener el lado más corto.
Y por último hago el calculo final que sería multiplicar por 2 la suma de los tres cálculos y luego sumarle el lado más corto,
y vacío el List.
Para resolver el segundo apartado lo he subdividido en dos cuentas. La primera la calculo creando un List donde introduzco 
largo,ancho y alto.Ordeno el List de menor a mayor y luego obtengo los dos primeros números que van a ser lo más
pequeños .Una vez que hemos hecho esto hacemos la operación para la primera cuenta que sería multiplicar por 2 el lado más corto y sumarle
el segundo lado más corto por 2. Y vacío el List. La segundo cuenta sería multiplicar largo * ancho * alto. Y por último sumamos las
dos cuentas  y ya tendriamos el segundo apartado calculado.
