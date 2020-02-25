package main

import (
	"crypto/md5"
	"fmt"
	"strconv"
	"time"

	"github.com/manifoldco/promptui"
)

func main() {
	input := "bgvyzdsv"
	stringToSearch := ""
	combinationFound := false
	combinationNumber := 0

	// Run Prompt selector
	prompt := promptui.Select{
		Label: "Ejecutar...",
		Items: []string{"Parte 1", "Parte 2"},
	}
	_, result, err := prompt.Run()
	if err != nil {
		panic("Error en el prompt")
	}

	// Start timer
	timer := time.Now()

	switch result {
	case "Parte 1":
		stringToSearch = "00000"
		break
	case "Parte 2":
		stringToSearch = "000000"
		break
	}

	for !combinationFound {
		newCombination := input + strconv.Itoa(combinationNumber)
		hashedCombination := fmt.Sprintf("%x", md5.Sum([]byte(newCombination)))
		if hashedCombination[0:len(stringToSearch)] == stringToSearch {
			combinationFound = true
			fmt.Println("La combinación de numeros correcta es ->", combinationNumber,
				"\r\nLa clave MD5 para", newCombination, "es", hashedCombination,
				"\r\nEl cálculo llevó", time.Since(timer).Milliseconds(), "ms.")
		} else {
			combinationNumber++
		}
	}
	fmt.Println("Saliendo...")
	time.Sleep(5 * time.Second)
}
