<?php

require_once 'models/Package.php';
require_once 'helpers/CreatePackagesFromFile.php';
require_once 'helpers/PacketWrappingHelper.php';

$dimensionPackageList = 'input/dimensionPackageList.php';

$packages = CreatePackagesFromFile::createPackages($dimensionPackageList);

$paperNeeded = PacketWrappingHelper::wrapMultiplePrismPackets($packages);
$ribbonNeeded = PacketWrappingHelper::setRibbonForMultiplePackets($packages);

echo '<h1> Part 1; ' . $paperNeeded . '</h1>';
echo '<h1> Part 2: ' . $ribbonNeeded . '</h1>';