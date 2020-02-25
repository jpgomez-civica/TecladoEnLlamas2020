<?php

require_once 'models/Santa.php';
$instructionsFile = __DIR__ . '/input/instructions.txt';

$santa = new Santa();
$locationLogs = $santa->executeInstructionsFile($instructionsFile);
echo '<h1>Part 1: </h1>' . count($santa->getUniqueLocations($locationLogs['santaLog']));


//  Part 2
$santa = new Santa();
$santa->createRobot();
$sharedLocationLogs = $santa->executeInstructionsFile($instructionsFile, true);
$housesVisited = array_merge(
                        $sharedLocationLogs['santaLog'],
                        $sharedLocationLogs['robotSantaLog']
                    );

$uniqueHousesVisited = $santa->getUniqueLocations($housesVisited);

echo '<h1>Part 2: </h1>' . count($uniqueHousesVisited);