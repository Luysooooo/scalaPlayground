println("Step 1: Using Tuple2 to store 2 data points")
val glazedDonutTuple = Tuple2("Glazed Donut", "Very Tasty")
println(s"Glazed Donut with 2 data points = $glazedDonutTuple")

println("\nStep 2: Access each element in tuple")
val donutType = glazedDonutTuple._1
val donutTasteLevel = glazedDonutTuple._2
println(s"$donutType taste level is $donutTasteLevel")

println("\nStep 3: Using TupleN classes to store more than 2 data points")
val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")

