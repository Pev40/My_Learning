<?php

/**
 *sort: Ordena un array.
 *rsort: Ordena un array en orden inverso.
 *ksort: Ordena un array por clave.
 *krsort: Ordena un array por clave en orden inverso.
 *array_slice: Extrae una parte de un array.
 *array_chunk: Divide un array en fragmentos.
 *array_shift: Quita un elemento del principio del array.
 *array_pop: Extrae el último elemento del final del array.
 *array_unshift: Añadir al inicio de un array uno a más elementos.
 *array_push: Inserta uno o más elementos al final de un array.
 *array_flip: Intercambia todas las claves de un array con sus valores asociados.
 */
$courses = [
    10 =>  'php',
    100 => 'javascript',
    1000 => 'laravel',
    1800 => 'sinfony'
];

ksort($courses);

echo "<pre>";
//var_dump($courses);



array_shift($courses);

array_pop($courses);
var_dump(array_chunk($courses, 3));
array_unshift($courses, 'php');
array_push($courses, 'sinfony');
array_flip($courses);
var_dump(array_chunk($courses, 3));
