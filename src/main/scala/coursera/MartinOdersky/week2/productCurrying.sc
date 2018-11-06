def product(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 1 else f(a) * product(f)(a + 1, b)

product(x => x * x)(3, 4)

def fact(n: Int) = product(x => x)(1, n)

fact(4)


def sumClean(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sumClean(f)(a + 1, b)

val ea = sumClean(x => x)(1, 5)


def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
  if (a > b) zero else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))


def productMapReduce(f: Int => Int)(a: Int, b: Int): Int =
mapReduce(f,(x,y)=>x*y,1)(a,b)

productMapReduce(x=>x*x)(3,4)

mapReduce(x=>x*x,(x,y)=>x*y,1)(3,4)