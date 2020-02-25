class prisma:
    def __init__(self,dimensiones):
        self.__dim_l=int(dimensiones.split("x")[0])
        self.__dim_w=int(dimensiones.split("x")[1])
        self.__dim_h=int(dimensiones.split("x")[2])
        
    def volument (self):
        return (2*self.__dim_l*self.__dim_w+2*self.__dim_w*self.__dim_h+2*self.__dim_h*self.__dim_l) + min(self.__dim_l*self.__dim_w,self.__dim_w*self.__dim_h,self.__dim_h*self.__dim_l)

    def longitud_cinta(self):
        def_var_order=[self.__dim_l,self.__dim_h, self.__dim_w]
        def_var_order.sort()
        return (def_var_order[0]+def_var_order[0]+def_var_order[1]+def_var_order[1]) + (self.__dim_l*self.__dim_w*self.__dim_h)    


import os
FileName="entrada.txt"
f = open (FileName, "r")
in_entrada=f.read().split()
f.close()

out_longitud=0

var_n_paquetes=len(in_entrada)
var_divisiones=4
var_base=var_n_paquetes//min(var_n_paquetes,var_divisiones)



for i in (range (0,var_base)):
    var_p=prisma(in_entrada[i])
    out_longitud+=var_p.longitud_cinta()
    if 1*var_base+i<var_n_paquetes:
        var_p=prisma(in_entrada[1*var_base+i])
        out_longitud+=var_p.longitud_cinta()
    if 2*var_base+i<var_n_paquetes:
        var_p=prisma(in_entrada[2*var_base+i])
        out_longitud+=var_p.longitud_cinta()
    if 3*var_base+i<var_n_paquetes:
        var_p=prisma(in_entrada[3*var_base+i])
        out_longitud+=var_p.longitud_cinta()

print("La longitud total necesaria es: "+ str(out_longitud))