def run():
    mi_diccionario ={
        'llave1' : 1,
        'llave2' : 2,
        'llave3' : 3,
    }
    print(mi_diccionario['llave1'])
#para definicir un diccionario nosotros debemos definicrlo con llaves
#Se define en comillas simples, dos puntos y el valor

    paises={
        'Peru' : 3145268,
        'Bolivia': 656151321,
        'Argentina': 25465132
    }

    for pais in paises.items():
        print(pais)

if __name__ == '__main__':
    run()