<?php
require_once '../traits/Files.php';
require_once 'models/Package.php';

class CreatePackagesFromFile {
    use Files;

    static function createPackages($file) {
        $packageList = self::readFileByLine($file);
        $packages = [];
    
        foreach($packageList as $packageDimensions) {
            list($length, $width, $height) = explode("x", $packageDimensions);
            $packages[] = new Package($length, $width, $height);
        }

        return $packages;
    }
}