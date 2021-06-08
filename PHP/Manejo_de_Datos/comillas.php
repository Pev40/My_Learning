<?php
echo 'UN TEXTO CULQUIERA ES CON \' <br>';
$name = 'Piero';
//La etiqueta br no puede ser usada con concatenacion de punto solo en doble comilla
//echo 'Mi nombre es '. $name . <br>;

echo "Mi nombre es  $name <br>";

$cursos = [
    'backend' => [
        'PHP',
        'Python',
        'NodeJS'
    ],
    'frontend' => [
        'JavaScript',
        'CSS3',
        'HTML5'
    ]
];

/*
USO DE PUNTEROS EN UNA CLASE PARA IMPRIMIR VALORES
*/

class User
{
    public $name = 'Piero';
}

$user = new User;


echo "$user->name quiere aprender {$cursos['backend'][0]} <br>";

/*
MOSTRAR EL CODIGO DE UN ARRAY SIEMPRE ES ENTRE COMILLAS Y CON UNA ESTRUCTURA DE COMILLAS DE SER NECESARIO
*/

echo "{$cursos['frontend'][2]}";


/**
 * USO DE INGRESO DINAMICO A LAS VARIABLES PARA PODERLO IMPRIMIR
 */

$profesor = [
    'contratado' => [
        'SUNI',
        'FLORES',
        'HINOJOSA',
        'SARMIENTO'
    ],
    'tiempoParcial' => [
        'IA',
        'VIDEOJUEGOS',
        'MACHACA'
    ]
];
$escuelaProfesional = [
    'ingenieria' => [
        'EPCC',
        'EPIS',
        'EPIA',
        'EPII'
    ],
    'biomedicas' => [
        'EPM',
        'EPE',
        'EPN',
        'EPIP'
    ]

];

$estadoContrado = [
    'SUSPENDIDO',
    'CONTRATADO'
];

for ($i = 0; $i < 4; $i++) {
    $j = random_int(0,1);
    $y = random_int(0,3);
    echo "<br> {$profesor['contratado'][$y]} esta {$estadoContrado[$j]} en {$escuelaProfesional['ingenieria'][$i]} <br>";
}
/**
 * se PUEDE ACCEDER A UNA VARIABLE CON EL MIMO NOMBRE SI SE LE COLOCA EL $ AL INICIO CON LLAVES
 */
$nombreEstudiante = 'PIERO_VIZCARRA';
$PIERO_VIZCARRA = ' TE DICE HOLA  :)';
echo "<br> SU nombre es: $nombreEstudiante y  ${$nombreEstudiante}";

/**
 * SE PUEDE USAR FUNCIONES PARA LLAMAR A OTRAS VARIABLES DE FORMA DINAMICA
 */
function getStudent(){
    return 'estudiante';
}

$estudiante = 'PIERO';
echo $estudiante;
echo "<br> {${getStudent()}} desde dentro de la funcion llamando a otra variable de forma dinamica";

