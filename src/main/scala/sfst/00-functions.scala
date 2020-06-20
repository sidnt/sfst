package sfst

////////////////////////////////////////////////////////////////////////

object ex0 extends App {
  println("welcome to speakfreely scala training")
}

////////////////////////////////////////////////////////////////////////

/* JOB OF FUNCTIONS
is to transform their inputs into outputs */
object ex1 extends App {

  /* a bit explicit */
  def squareTheInt(input: Int): Int = ???

  /* a bit more general. the transformation is upto us. */
  def transformIntToInt(input: Int): Int = ???

  /* even more general, the input and output type are upto us */
  type Input  = ???
  type Output = ???
  def transformInput(input: Input): Output = ???

  println(squareTheInt(7))
  println(transformIntToInt(13))
  println(transformInput(???))

}

////////////////////////////////////////////////////////////////////////

/* a function has a DOMAIN and a CODOMAIN */
object ex2 extends App {

  /* domain is what the function is able to accept as input */
  type Domain = ???
  /* codomain is what the function returns as output */
  type CoDomain = ???

  /* #discipline
  when talking about functions in our codebase
  instead of saying return type and return value
  we will say, domain and codomain */
  def transformInput(input: Domain): CoDomain = ???
  println(transformInput(???))

}

////////////////////////////////////////////////////////////////////////

/* put iow, job of a function
is also, to COMPOSE their inputs into outputs */
object ex3 extends App {

  type Input  = ???
  type Output = ???
  def composeInputs(input1: Input, input2: Input): Output = ???
  println(composeInputs(???, ???))

}

////////////////////////////////////////////////////////////////////////

/* functions are also simple rewrite rules
for matching cases */
object ex4 extends App {

  def wordify(n: Int): String = ???
  println(wordify(5))
  println(wordify(9999))

}

////////////////////////////////////////////////////////////////////////

/* PRIMER ON TYPES & VALUES
types are important
domain and codomain are, essentially, types
values are what conform to the types */
object ex5 {

  /* types and values are related
  type is a collection of properties provable about a value */
  def discuss_Examples_Of_Types_And_Values = ???
  /* eg LivingThing Flora Fauna Vertebrates Invertebrates Mammals ... */
  /* a value can conform to many types
    eg jacinda is a woman. also, a homo sapien. also a mammal. a vertebrate
    if the properties are proved, a value conforms to the respective type */

}

/* PROPERTIES OF FUNCTIONS IN FUNCTIONAL PROGRAMMING
1 - total
2 - deterministic
3 - side effects free
4 - doesn't throw exceptions 
5 - always returns. iow, doesn't take ∞ time */

object ex6 extends App {

  /* a total function is
  one which is defined for all values in the domain
  iow, for each value conforming to its domain
  it computes a value conforming to its codomain */

  /* a partial function is
  undefined at at least 1 value conforming to its domain */

  def parseInt_Partial(s: String): Int   = s.toInt
  def parseInt_Total(s: String): ??? = ???

  println(parseInt_Partial("3"))
  println(parseInt_Partial("hello"))

  println(parseInt_Total("3"))
  println(parseInt_Total("hello"))

}

object ex7 extends App { import java.time.LocalTime; type Hours = Int

  /* a non deterministic function is one
  which can compute different values for the same input values */

  def timeAfterXHours(x: Hours):LocalTime = LocalTime.now.plusHours(x)
  println(timeAfterXHours(2))
  
  
  /* a deterministic function
  always returns the same input
  for the same output */
  def timeAfterXHoursFromTimeY(x: Hours, y: LocalTime) = y.plusHours(x)
  
  val startTime = LocalTime.parse("03:18:23")
  println(timeAfterXHoursFromTimeY(2, startTime))

}

object ex8 extends App {

  /* a side-effect is something that a function does
  apart from computing its return value */
  def doubleTheInt_SE(i: Int): Int = {
    println("doubling the int " + i)
    i * 2
  }
  println(doubleTheInt_SE(8))

  /* a side effect free function, is one
  which doesn't do anything other than computing the return value */
  def doubleTheInt_SEFree(i: Int): ??? = ???
  println(doubleTheInt_SEFree(8))

}