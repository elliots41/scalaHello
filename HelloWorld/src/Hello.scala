object Hello {
  def main(args: Array[String]) {
    var myVar: String = "Foo"
    val myVal1 = "Hello Scala"
    println("Hello, World!")

    val pt = new Point(10, 20)
    pt.move(10, 10)
    val loc = new Location(pt.x, pt.y, 10)
    loc.move(0, 0, 10)

    println(addInt(1, 2))

    val name = "Elliot"
    println(s"hello, $name")
    println(s"1+1=${1+1}")
  }
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }
}