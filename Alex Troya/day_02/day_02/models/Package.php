<?php


class Package {

    private array $dimensions;

    function __construct($length, $width, $height) {
        $this->dimensions = [
                                "length"=> intval($length), 
                                "width"=> intval($width),
                                "height"=> intval($height)
                            ];
    }

    public function getDimensions(): array {
        return $this->dimensions;
    }

    public function getlength(): array {
        return $this->dimensions['length'];
    }
    public function getWidth(): array {
        return $this->dimensions['width'];
    }
    public function getHeight(): array {
        return $this->dimensions['height'];
    }

    public function getArea(): int {
        $dimensions = $this->getDimensions();
        $area = (2 * $dimensions["length"] * $dimensions["width"]) + (2 * $dimensions["width"] * $dimensions["height"]) + (2 * $dimensions["height"] * $dimensions["length"]);

        return $area;
    }

    public function getSmallestSideArea() {
        $sortedDimensions = $this->getSortedDimensions();
        $area = $sortedDimensions[0] * $sortedDimensions[1];
        return $area;
    }

    public function getSmallestPerimeter() {
        $sortedDimensions =  $this->getSortedDimensions();
        $smallestPerimeter = (($sortedDimensions[0] * 2) + ($sortedDimensions[1] * 2) + ($sortedDimensions[0] * $sortedDimensions[1] * $sortedDimensions[2]));

        return $smallestPerimeter;
    }

    private function getSortedDimensions() {
        $dimensions = $this->getDimensions();
        sort($dimensions);
        return $dimensions;
    }
}