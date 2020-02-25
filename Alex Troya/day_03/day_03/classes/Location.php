<?php

abstract class Location {

    private $latitude; 
    private $longitude;

    public function getLatitude() {
        return $this->latitude;
    }

    public function getLongitude() {
        return $this->longitude;
    }

    public function setLatitude($value) {
        $this->latitude = $value;
    }

    public function setLongitude($value) {
        $this->longitude = $value;
    }

    public  function setCoordinates($coordinates) {
        $this->setLatitude($coordinates["latitude"]);
        $this->setLongitude($coordinates["longitude"]);
    }

    function moveNorth() {
        $this->setLatitude($this->getLatitude() + 1);
    }

    function moveSouth() {
        $this->setLatitude($this->getLatitude() - 1);
    }

    function moveEast() {
        $this->setLongitude($this->getLongitude() + 1);
    }

    function moveWest() {
        $this->setLongitude($this->getLongitude() - 1);
    }

    public function getCoordinates() {
        return [
            "latitude" => $this->getLatitude(),
            "longitude" => $this->getLongitude()
        ];
    }


}