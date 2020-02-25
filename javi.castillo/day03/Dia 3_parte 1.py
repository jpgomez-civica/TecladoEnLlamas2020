class Santa:
    def __init__(self):
        self.__fila=0
        self.__columna=0
        self.__list_casas=[[0,0]]


    def __sube(self):
        self.__columna-=1
    def __baja(self):
        self.__columna+=1
    def __izq(self):
        self.__fila-=1
    def __drch(self):
        self.__fila+=1 
    def __addcasa(self):
        if [self.__fila,self.__columna] not in self.__list_casas:
            self.__list_casas.append([self.__fila,self.__columna])
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
    def Ncasas(self):
        return len(self.__list_casas)
    def ListaCasas(self):
        return self.__list_casas


in_entrada=input()

S1=Santa()

for i in range(0, len(in_entrada)):
    S1.movimiento(in_entrada[i])

#print (S1.ListaCasas())
print ("El número de casas distintas que ha visitado es: " + str(S1.Ncasas()))