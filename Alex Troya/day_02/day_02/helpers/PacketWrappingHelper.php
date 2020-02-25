<?php

class PacketWrappingHelper {

    static function wrapRegularPrismPacket($package) {
        $paperNeeded = $package->getArea() + $package->getSmallestSideArea();

        $package->getSmallestSideArea();

        return $paperNeeded;
    }

    static function wrapMultiplePrismPackets($packages) {
        $paperNeeded = 0;

        foreach($packages as $package) {
            $paperNeeded += self::wrapRegularPrismPacket($package);
        }

        return $paperNeeded;
    }

    static function setRibbonForPacket($package) {
        $ribbonNeeded = $package->getSmallestPerimeter();
        return $ribbonNeeded;
    }

    static function setRibbonForMultiplePackets($packages) {
        $ribbonNeeded = 0;

        foreach($packages as $package) {
            $ribbonNeeded += self::setRibbonForPacket($package);
        }

        return $ribbonNeeded;
    }

}