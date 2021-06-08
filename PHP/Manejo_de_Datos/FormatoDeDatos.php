<?php
$text = '<h1>PHP es un lenguaje</h1>';
/**
 * STRTOUPPER(STRING)
 * USAMOS PARA CONVERTIR TODO A MAYUSCULAs
 */
echo strtoupper($text);
/*
* STRTOLOWER (STRING)
* USAMOS PARA CONVERTIR TODO A MINUSCULAS
*/
echo '<br>'.strtolower($text);
/**
 * UCFIRST y LCFIRT para convertir la 
 * primera letra en mayuscula y minuscula respectivamente
 */
echo '<br>'.ucfirst(strtolower( $text));
echo '<br>'.lcfirst($text);
/**
 * STR_REPLACE
 * AYUDA A REMPLAZAR CARACTERES COMUNES
 */
echo '<br>'. str_replace(' ','_',$text);

/**
 * CON STRIP_TAGS(STRING) PODEMOS RETIRAR TODA CLASE DE ETIQUETAD DE CODIGO
 */

echo '<br>'.strip_tags($text);

/**
 * CON 
 * STR_PAD (STRING, N°CARACTERES,REMPLAZANTE,FORMATO)
 */
$text = 58;
echo '<br>'. str_pad($text,10,0,STR_PAD_BOTH);
/**
 * 
 */