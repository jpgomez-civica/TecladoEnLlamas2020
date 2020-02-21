package main

import (
	"day_1/utils"
	"fmt"
	"time"
)

func main() {
	input := utils.ReadInputFile()
	targetFloor := 0
	timer := time.Now() // For execution time measuring.
	for position, character := range input {
		if character == '(' {
			targetFloor++
		} else if character == ')' {
			targetFloor--
		} else {
			panic("Error. El archivo de entrada no tiene el formato esperado.")
		}
		if targetFloor == -1 {
			fmt.Println("La posición en que entra al sótano es ->", (position + 1),
				"\r\nEl cálculo llevó", time.Since(timer).Microseconds(), "µs.")
			break
		}
	}
	fmt.Println("Saliendo...")
	time.Sleep(5 * time.Second)
}
