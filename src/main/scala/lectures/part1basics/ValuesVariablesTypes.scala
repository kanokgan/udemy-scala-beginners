package lectures.part1basics

object ValuesVariablesTypes {
  def main(args: Array[String]): Unit = {

    val x: Int = 42
    println(x)

    // x = 2 cannot be re-assign

    var y: Int = 42
    y = 10
    println(y)
  }
}
