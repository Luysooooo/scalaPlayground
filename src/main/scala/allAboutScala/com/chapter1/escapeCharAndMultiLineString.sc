
//How to escape a JSON string, Backslash
println("Step 1: How to escape a Json String")
//val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
println("\nStep 2: Using backslash to escape quotes")
val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
println(s"donutJson2 = $donutJson2")
//Use triple quotes to escape larger text
println("\nStep 3: Using triple quotes \"\"\" to escape characters")
val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
println(s"donutJson3 = $donutJson3")
//Multi line text using Strip Margin
println("\nStep 4:  Creating multi-line text using stripMargin")
val donutJson4: String =
  """
    |{
    |"donut_name":"Glazed Donut",
    |"taste_level":"Very Tasty",
    |"price":2.50
    |}
  """
    .stripMargin

