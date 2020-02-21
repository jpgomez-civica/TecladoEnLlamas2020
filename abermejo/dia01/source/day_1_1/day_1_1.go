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
	for _, character := range input {
		if character == '(' {
			targetFloor++
		} else if character == ')' {
			targetFloor--
		} else {
			panic("Error. El archivo de entrada no tiene el formato esperado.")
		}
	}
	fmt.Println("El resultado final es ->", targetFloor,
		"\r\nEl cálculo llevó", time.Since(timer).Microseconds(), "µs.")
	fmt.Println("Saliendo...")
	time.Sleep(5 * time.Second)
}
