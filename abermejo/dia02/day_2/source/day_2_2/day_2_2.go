package main

import (
	. "day_2/source/models"
	"day_2/source/utils"
	"fmt"
	"strings"
	"time"
)

func main() {
	input := utils.ReadInputFile()
	timer := time.Now() // For execution time measuring.
	ribbonNeeded := 0
	for _, inp := range strings.Split(input, "\r\n") {
		present := NewPresentFromMeasuresArray(strings.Split(inp, "x"))
		ribbonNeeded += present.GetRibbonNeeded()
	}

	fmt.Println("La cantidad exacta de lazo necesaria es ->", ribbonNeeded, "ft.",
		"\r\nEl cálculo llevó", time.Since(timer).Microseconds(), "µs.")
	fmt.Println("Saliendo...")
	time.Sleep(5 * time.Second)
}
