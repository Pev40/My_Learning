<?php
$password1 = '12345aaaa';

var_dump((bool)preg_match('/^[0-9][a-z]{6,9}$/',$password1));
