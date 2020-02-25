list_casas_total=([])

class Santa:
    def __init__(self):
        self.__fila=0
        self.__columna=0
        
    def __sube(self):
        self.__columna-=1
    def __baja(self):
        self.__columna+=1
    def __izq(self):
        self.__fila-=1
    def __drch(self):
        self.__fila+=1 
    def __addcasa(self):
        if [self.__fila,self.__columna] not in list_casas_total:
            list_casas_total.append([self.__fila,self.__columna])

    def movimiento (self,mov):
        if mov== '<':
            self.__izq()
        elif mov == '>':
            self.__drch()
        elif mov == '^':
            self.__sube()
        elif mov == 'v':
            self.__baja()
        self.__addcasa()


in_entrada=input()

S1=Santa()
S2=Santa()
list_casas_total.append([0,0])
i=0
while i<len(in_entrada):
    S1.movimiento(in_entrada[i])
    i+=1
    if i<len(in_entrada):
        S2.movimiento(in_entrada[i])
        i+=1
        


print ("El número de casas distintas que ha visitado los dos Santa es: " + str(len(list_casas_total)))