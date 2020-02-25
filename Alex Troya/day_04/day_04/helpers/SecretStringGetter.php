<?php
require_once '../traits/Files.php';

class SecretStringGetter {
    use Files;

    static function getSecretString($file) {
        $content = self::readFileByLine($file);
        $secretString = $content[0];

        return $secretString;
    }
}