<?php


require_once 'models/Lift.php';


$instructionsFile = __DIR__ . '/input/liftInstructions.txt';

$santasLift= new Lift();

$liftMovementLog = $santasLift->executeInstructionsFile($instructionsFile);
$firstBasementEnter = array_search(-1, $liftMovementLog) + 1;

echo "<h1> Part 1: " . end($liftMovementLog) . "</h1>";
echo "<h1> Part 2:  " . $firstBasementEnter . "</h1>";
