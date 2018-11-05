package coursera.MartinOdersky.week2

object week2 {
  //Functions are treated as first class values, can take functions as parameters and return functions.

  def sumInts(a: Int, b: Int): Int = if (a > b) 0 else a + sumInts(a + 1, b)

  def cube(x: Int): Int = x * x * x * x

  def sumCubes(a: Int, b: Int): Int = if (a > b) 0 else cube(a) + sumCubes(a + 1, b)




}
