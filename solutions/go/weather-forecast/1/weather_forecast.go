// Package weather show weather now.
package weather

// CurrentCondition variable.
var CurrentCondition string
// CurrentLocation variable.
var CurrentLocation string

// Forecast function. 
// Forecast function show the current weather condition.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
