var increase = (x: Int) => x + 1

increase(10)

increase = (x: Int) => x + 1000

increase(10)

val ints = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
ints.foreach(println)

ints filter(_ > 5) foreach(println _)

val sum = (_: Int) + (_: Int)
ints reduceLeft(sum)

sum(10, 20)


def otherSum(a: Int, b: Int, c: Int) = a + b + c

val oSum =  otherSum _

oSum(1, 2, 10)

oSum apply(1, 2, 10)

val b = otherSum(1, _: Int, 3)

b(2)

b apply 6




