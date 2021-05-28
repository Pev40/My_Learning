def promedio():
    contador = 0
    cantidad = 0
    positivos = 0
    negativos = 0
    while True:
        a = int(input("Ingrese numero"))
        contador = contador + a
        cantidad = cantidad + 1
        print("Su raiz es", a**(1/2))
        print("La media de los numeros ingresados es: " , contador/cantidad)
        if a>0 :
            positivos = positivos + 1
        else:
            negativos = negativos + 1
        print("hay positivos: ", positivos)
        print("hay negativos: ",negativos)
            
        


def run():
    promedio()


if __name__ == '__main__':
    run()
