package scala.lang

import scala.concurrent.Future
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object FutureCallback extends App {
  println("Starting calculations...my thread is: " + Thread.currentThread())

  val f = Future {
    val random = Random.nextInt(500)
    println("Let me sleep in thread " + Thread.currentThread() + s" for $random millis bro...")
    Thread.sleep(random)
    42
  }

  println("before onComplete")

  f.onComplete {
    case Success(value) => println(s"I finished my task! Got the callback, meaning = $value in thread " + Thread.currentThread())
    case Failure(exception) => exception.printStackTrace()
  }
  println("A ...")
  Thread.sleep(100)
  println("B ...")
  Thread.sleep(100)
  println("C ...")
  Thread.sleep(100)
  println("D ...")
  Thread.sleep(100)
  println("E ...")
  Thread.sleep(100)
  println("F ...")
  Thread.sleep(100)
  Thread.sleep(2000)

}
