import random


def generador():
    mayusculas = ['A', 'B', 'C', 'D', 'E']
    minusculas = ['a', 'b', 'c', 'd', 'e']
    numeros = ['1', '2', '3', '4', '5']
    simbolos = ['@', '<', '>', '!', '=']

    carateres = mayusculas + minusculas + numeros + simbolos
    contrasena = []
    for i in range(15):
        carateres_random = random.choice(caracteres)
        contrasena.append(carateres_random)
    contrasena = "".join(contrasena)
    return contrasena


def run():
    resultado = generador()
    print("Tu contraseña es: " + resultado)


if __name__ == '__main__' :
    run()
