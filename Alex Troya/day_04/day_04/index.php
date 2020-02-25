<?php
require_once 'helpers/NumberFinder.php';
require_once 'helpers/SecretStringGetter.php';

$file = 'input/secretCode.txt';
$secretString = SecretStringGetter::getSecretString($file);

const PART_TWO_REQUIREMENTS = [
    "regPattern" => '/^0{6}/'
];

$secretNumber1 = NumberFinder::findSecretNumber($secretString);
$secretNumber2 = NumberFInder::findSecretNumber($secretString, PART_TWO_REQUIREMENTS);


echo '<h1>Part 1 : ' . $secretNumber1 . '</h1>';
echo '<h1>Part 2 : ' . $secretNumber2 . '</h1>';