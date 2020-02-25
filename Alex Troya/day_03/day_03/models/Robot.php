<?php

require_once 'classes/Location.php';

class Robot extends Location {

    function __construct() {
        $this->setCoordinates(["latitude" => 0, "longitude" => 0]);
    }


}
