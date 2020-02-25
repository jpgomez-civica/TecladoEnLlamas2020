package main

import (
	"crypto/md5"
	"fmt"
	"strconv"
	"time"
)

func main() {
	input := "bgvyzdsv"
	combinationFound := false
	combinationNumber := 0
	timer := time.Now()

	for !combinationFound {
		newCombination := input + strconv.Itoa(combinationNumber)
		hashedCombination := fmt.Sprintf("%x", md5.Sum([]byte(newCombination)))
		if hashedCombination[0:5] == "00000" {
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
