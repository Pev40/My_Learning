#include <iostream>
#include <stdio.h>

using namespace std;

int main()
{
    float anhos;
    float tasa;
    float capital;

    cout << "Ingrese el capital: ";
    cin >> capital;

    cout << "Ingrese el tasa: ";
    cin >> tasa;

    cout << "Ingrese el años: ";
    cin >> anhos;
    
    cout << capital << "  " << tasa << "  " << anhos << endl;
    
    int capitalfinal = 0;
    capitalfinal = capital * (1 + (tasa / 100)) * anhos;
    cout << "Mostrar capital final: " << capitalfinal;
    system("pause");
    return 0;
}