<?php

/**
 * 
 */
trait Files
{
    private function readFileByLine($fileUri): array {

        $fileContent = file_get_contents($fileUri);
        $fileLines = explode("\n", $fileContent);
        
        return $fileLines;
    }

    private function readFileByChar($fileUri): array {
        

        $fileContent = file_get_contents($fileUri);
        $fileContent = str_replace(array("\n", "\t", "\r"), '', $fileContent);
        $fileChars = str_split($fileContent);
        
        return $fileChars;
    }
}
