package lectures.part1basics

/*
* Created by : Thyag Sundaramorthy
* 1/29/2020
*/


object Expressions extends App {

  val x = 1 + 2
  //println(x)

  val a = 4
  val b = 5

  val score = if(a==b) 100 else 10
 // println(score)

  val cond = false
  val mycond = if(cond) 5 else 3 //if expression

 // println(if(cond) 5 else 3)


  //EVERYTHING in Scala is an expression
  var avar = 5

  val weird = (avar = 3)
  println(avar)

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  val somevalue = {
    2 < 3
  }

  val someothervalue = {
    if(somevalue) 239 else 96
    42
  }

  println(somevalue)
  println(someothervalue)

}
