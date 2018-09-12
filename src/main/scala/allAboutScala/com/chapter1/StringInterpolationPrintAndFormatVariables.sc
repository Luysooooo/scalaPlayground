//Interpolation of a string val in printer, prefix an s in our String inside
// of our printer and use $ to make the reference
println("\nStep 1: Using String interpolation to print a variable")
val favoriteDonut: String = "Glazed Donut"
println(s"My favorite donut = $favoriteDonut")
//Using String interpolation on object properties
println("\nStep2: Using string interpolation on object properties")
case class Donut(name: String, tasteLevel: String)
val favoriteDonut2: Donut =Donut("Glazed Donut", "Very Tasty")
println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")
//String interpolation to evaluate expressions
println("\nStep 3: Using String interpolation to evaluate expressions")
val qtyDonutsToBuy: Int = 10
println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")
//String interpolation for formatting text
//you may want to format your strings by say pre-pending some white spaces in front of the text.
//This can be achieved using the f interpolation
println("\nStep 4: Using String interpolation for formatting text")
val donutName: String = "Vanilla Donut"
val donutTasteLevel: String = "Tasty"
println(f"$donutName%20s $donutTasteLevel")
//f interpolation to format numbers, adding two decimals
println("\nStep 5: Using f interpolation to format numbers")
val donutPrice: Double = 2.5
println(s"Donut price = $donutPrice")
println(f"Formatted donut price = $donutPrice%.2f")
//Using raw interpolation allow u to print symbols
println("\nStep 6: Using raw interpolation")
println(raw"Favorite donut \t$donutName")


