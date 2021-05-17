<?php

//Asignacion
$num = 9;
$lang =   
[
    'es' => 'español',
    'en' => 'ingles'
];

// arimetica

echo "suma 2+2 ". ((int)2 + (int)2);
echo "resta 2-2 ". ((int)2 - (int)2);
echo "multplicacion 2+2 ". 2*2;
echo "division 2+2 ". 2/2;
echo "modulo 2+2 ". 2%2;
echo "exponencial 2 ^ 2 ". 2 ** 2;

//TIpos de ciclos

do {
    # code...
} while ($a <= 10);

while ($a <= 10) {
    # code...
}

for ($i=0; $i < 10 ; $i++) { 
    # code...
}

switch ($variable) {
    case 'value':
        # code...
        break;
    
    default:
        # code...
        break;
}

foreach ($variable as $key => $value) {
    # code...
}
