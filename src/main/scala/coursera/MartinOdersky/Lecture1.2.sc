34+65
def radius = 10
def pi = 3.14159
radius * pi

(2 * pi) * radius

def loop : Int = loop

//Call by value: Given a function, reduces parameters first and then rewrite the function
//Call by name: Given a function, applies the function first.

//Scala normally uses Call by value, but if  the type of  function parameter starts with =>
//it uses call by name.

def x = loop
//val x = loop gives an infinite loop. Def is call by name, val is by value
