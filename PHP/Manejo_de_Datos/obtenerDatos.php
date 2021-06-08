<?php
$data = 'ESTUDIAMOs PHP';
/**
 * PODEMOS EXTRAER CARACTERES CON STBSTR
 */
$post = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi vulputate at sapien vel blandit. Duis cursus turpis ac facilisis tristique';
$extract = substr($post, 0, 50);

echo  substr($post,0,20). '...[ver más]';

/**
 * PODEMOS CONVERTIR DE UN STRING A UN ARRAY SOLO CON
 * LA FUNCION EXPLODE(COMO IDENTIFICA EL SEPARADOR, EL STRING  );
 */

$datos = 'Javascript, PHP, Laravel, Typescript';
$tags = explode(', ',$datos);
echo '<pre>';
var_dump($tags);
/**
 * PODEMOS CONVERTIR UN ARRAY A UN STRING CON LA FUNCION
 * IMPLODE(PARAMETRO PARA CODER CONCATENAR LOS ELEMENTOS, ARRAY ELEGIDO);
 */

$cursos = ['Javascript', 'PHP', 'Laravel', 'Typescript'];
echo implode(', ',$cursos);

/**
 * PARA PODER SUPRIMIR LOS ESPACIOS EN UN STRING SE USA
 * TRIM(STRING);
 * LTRIM SI ES PARA IZQUIERDA
 * RTRIM SI ES PARA DERECHA
 * TRIM SI SE DESEA PARA AMBOS
 */

 echo '<br>'.trim(implode(',',$cursos));