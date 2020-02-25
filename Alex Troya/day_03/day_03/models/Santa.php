<?php

require_once 'classes/Location.php';
require_once 'Robot.php';
require_once '../traits/Files.php';

class Santa extends Location{

    use Files;
    private $robot;

    const MOVENORTH_INSTRUCTION = "^";
    const MOVESOUTH_INSTRUCTION = "v";
    const MOVEDEAST_INSTRUCTION = ">";
    const MOVEWEST_INSTRUCTION = "<";

    function __construct() {
        $this->setCoordinates(["latitude" => 0, "longitude" => 0]);
    }

    function executeInstructionsFile($instructionsFile, $workingWithRoboSanta = false) : array {
        $instructions = $this->readFileByChar($instructionsFile);

        $santaLog[] = $this->getCoordinates();
        $robotSantaLog = [];

        if($this->robot) {
           $robotSantaLog[] = $this->robot->getCoordinates();
        }

        foreach ($instructions as $instructionIndex => $instruction) {
            
            if($workingWithRoboSanta === true && $instructionIndex % 2 !== 0) {
                $who = $this->getRobot();
            } else {
                $who = $this;
            }

            $this->interpretInstruction($instruction, $who);

            $positionLog = [
                "latitude" => $who->getLatitude(),
                "longitude" => $who->getLongitude()
            ];

            if($workingWithRoboSanta === true && $instructionIndex % 2 !== 0) {
                $robotSantaLog[] = $positionLog;

            } else {
                $santaLog[] = $positionLog;
            }
        }

        return ["santaLog" => $santaLog, "robotSantaLog" => $robotSantaLog];
    }

    function getUniqueLocations($locationLog) {
        return array_unique($locationLog, SORT_REGULAR);
    }

    function getLocationsLog($locationLog) {
        return array_merge($locationLog['santaLog'], $locationLog['roboSantaLog']);
    }

    function getRobot() {
        return $this->robot;
    }

    function createRobot() {
        $this->robot = new Robot();
    }

    private function interpretInstruction($instruction, $who) {
        
        switch (strtolower($instruction)) {
            
            case self::MOVENORTH_INSTRUCTION :
                $who->moveNorth();
                break;

            case self::MOVESOUTH_INSTRUCTION :
                $who->moveSouth();

                break;

            case self::MOVEDEAST_INSTRUCTION :
                $who->moveEast();
                break;

            case self::MOVEWEST_INSTRUCTION :
                $who->moveWest();
                break;
            
            default:
                echo "Instruccion " . $instruction . " no reconocida.";
                break;
        }
    }
}