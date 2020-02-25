<?php
require_once '../traits/Files.php';

class NumberFinder {
    use Files;
    const DEFAULT_REQUIREMENTS = [
        "regPattern" => '/^0{5}/'
    ];

    static function findSecretNumber($secretString, $requirements = self::DEFAULT_REQUIREMENTS) {
        $secretNumber = 0;
        $found = false;
        
        while (!$found) {            
            $possibleString = $secretString . $secretNumber;
            $hash = md5($possibleString);
            
            $found = self::meetRequirements($hash, $requirements['regPattern']);
            if(!$found) {++$secretNumber;}
        }

        return $secretNumber;
    }

    private static function meetRequirements($hash, $regex) {
        return (preg_match($regex, $hash)) ? true : false;
    }

}