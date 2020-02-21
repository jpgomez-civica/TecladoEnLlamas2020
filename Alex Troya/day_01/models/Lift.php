<?php

require_once '../traits/Files.php';

class Lift {

    use Files;
    const MOVEUP_INSTRUCTION = "(";
    const MOVEDOWN_INSTRUCTION = ")";

    private int $currentFloor;

    function __construct() {
        $this->setCurrentFloor(0);
    }


    public function getCurrentFloor() {
        return $this->currentFloor;
    }

    public function executeInstructionsFile($instructionsFile) : array {
        $instructions = $this->readFileByChar($instructionsFile);
        $movementLog = [];

        foreach ($instructions as $instructionIndex => $instruction) {
            $this->interpretInstruction($instruction);
            $movementLog[] = $this->currentFloor;
        }

        return $movementLog;
    }

    private function setCurrentFloor(int $value) {
        $this->currentFloor = $value;
    }

    private function moveUp() {
        $this->setCurrentFloor(++$this->currentFloor);
    }

    private function moveDown() {
        $this->setCurrentFloor(--$this->currentFloor);
    }

    public function isOnBasement(array $instruction) {
        if($this->currentFloor == -1) {
            // echo 'Instruction ' . $instruction['instruction'] .' at position' . ($instruction['index'] + 1).' moved us into basement <br/>';
        }
    }

    private function interpretInstruction($instruction) {
        
        switch ($instruction) {

            case self::MOVEUP_INSTRUCTION :
                $this->moveUp();
                break;

            case self::MOVEDOWN_INSTRUCTION :
                $this->moveDown();
                break;
            
            default:
                echo "Instruccion " . $instruction . " no reconocida.";
                break;

        }
    }

    
}