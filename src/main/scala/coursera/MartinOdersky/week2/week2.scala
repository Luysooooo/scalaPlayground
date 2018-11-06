package coursera.MartinOdersky.week2

object week2 {
  //Functions are treated as first class values, can take functions as parameters and return functions.

  //def sumInts(a: Int, b: Int): Int = if (a > b) 0 else a + sumInts(a + 1, b)

  //def sumCubes(a: Int, b: Int): Int = if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

  //def sumFactorials (a:Int,b:Int):Int = if (a>b)0 else fact(a) + sumFactorials(a+1,b)

  //Can we factor out the common pattern?

  def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)

  //Then we can write:

  def sumIntsNoAnoymousFunction(a: Int, b: Int) = sum(id, a, b)

  def sumCubesNoAnoymousFunction(a: Int, b: Int) = sum(cube, a, b)

  def sumFactorialsNoAnoymousFunction(a: Int, b: Int) = sum(fact, a, b)

  //Auxiliars

  def id(x: Int): Int = x

  def cube(x: Int): Int = x * x * x * x

  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

  //AnonymousFunction Added, we dont need Auxiliars anymore

  def sumInts(a: Int, b: Int) = sum(x => x, a, b)

  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)

  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

  //Write  tailrecursive version of sum

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)

    loop(a, 0)
  }

  //Result:
  sum(x => x * x, 3, 5) //50

  //Currying
  //lets get rid of a and b rewriting sum

  def sumCurry(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)

    sumF
  }

  //With currying we avoid to put those parameters

  def sumIntsCurry = sumCurry(x => x)

  def sumCubesCurry = sumCurry(x => x * x * x)

  def sumFactorialsCurry = sumCurry(fact)

  sumCubesCurry(1, 10) + sumFactorialsCurry(1, 10)

  //Can we avoid the middleman? sumInts, sumCubes...

  sumCurry(cube)(1, 10)

  //Lets apply syntactic sugar to sum function

  def sumClean(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sumClean(f)(a + 1, b)




}
