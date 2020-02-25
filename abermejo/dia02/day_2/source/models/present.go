package models

import (
	"sort"
	"strconv"
)

// Present object
type Present struct {
	length int
	width  int
	height int
}

// NewPresentFromMeasuresArray -> Constructor
func NewPresentFromMeasuresArray(measures []string) Present {

	length, errorLength := strconv.Atoi(measures[0])
	width, errorWidth := strconv.Atoi(measures[1])
	height, errorHeight := strconv.Atoi(measures[2])

	// Error check
	if len(measures) != 3 || errorLength != nil || errorWidth != nil || errorHeight != nil {
		panic("Error al leer las medidas.")
	}

	return Present{length, width, height}
}

// GetPaperNeeded -> extension method -> calculates square feets of paper needed for present.
func (present *Present) GetPaperNeeded() int {

	// Calculate all areas
	areaFront := present.length * present.width
	areaSide := present.width * present.height
	areaTop := present.height * present.length

	// Calculate min area
	minArea := areaFront
	if areaSide < minArea {
		minArea = areaSide
	}
	if areaTop < minArea {
		minArea = areaTop
	}

	totalPaperNeeded := (2 * areaFront) + (2 * areaSide) + (2 * areaTop) + minArea
	return totalPaperNeeded
}

// GetRibbonNeeded calculates feets of ribbon needed.
func (present *Present) GetRibbonNeeded() int {

	// We need 2 min measures. Convert to array and sort it.
	measures := []int{present.length, present.width, present.height}
	sort.Ints(measures)

	totalRibbonNeeded := measures[0] + measures[0] + measures[1] + measures[1] + present.getVolume()
	return totalRibbonNeeded
}

func (present *Present) getVolume() int {
	return present.length * present.width * present.height
}
