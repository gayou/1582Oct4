<?php

//DateTime
$date = new DateTime('1582-10-04');
echo $date->format('Y-m-d')."\n";
echo $date->modify('+1 days')->format('Y-m-d')."\n";
