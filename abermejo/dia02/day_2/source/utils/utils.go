package utils

import (
	"io/ioutil"
	"os"
	"path/filepath"
)

// ReadInputFile returns content of input.txt as string.
func ReadInputFile() string {
	// Get execution path and open input.txt file
	executable, _ := os.Executable()
	file, fileError := os.Open(filepath.Dir(executable) + "\\input.txt")
	//file, fileError := os.Open("../../input.txt")	// Only for dev (go run ...)
	// Check errors opening file.
	if fileError != nil {
		panic("Error al abrir el archivo. -> " + fileError.Error())
	}
	defer file.Close()
	input, _ := ioutil.ReadAll(file)
	return string(input)
}
