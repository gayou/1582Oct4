package main

import(
	"fmt"
	"time"
)

var example []string

func main() {
	t := time.Date(1582, 10, 4, 0, 0, 0, 0, time.Local)
	fmt.Println(t)

	t = t.AddDate(0, 0, 1)
	fmt.Println(t)
}
