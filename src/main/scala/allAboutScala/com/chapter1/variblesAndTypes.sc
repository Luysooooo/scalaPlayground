//Once  val has been assigned, cant be undone.
val firstValue : String = "Hello"
//Use var if you really need to chnge vue, but should be used in functional programming.
var firstVar: String= "Hello var"
//Lazy evaluation: Delay the intilization of a val til is conumed for first time.
//Type inference= Scala automaticaly knows the type when we declare a value if we dont put it.
lazy val donutService= "VanillaDonut"
//Declaring variables with no initialization, just used with var (wildcard operator)
var leastFavoriteDonut : String = _
leastFavoriteDonut = "Plain Donut"
