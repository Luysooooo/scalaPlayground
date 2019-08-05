package scala.lang

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object FutureBlocking extends App {

  //used by 'time method
  implicit val baseTime = System.currentTimeMillis()

  //2 - Create a Future
  val f = Future {
    println("I'm sleepy...Let me rest 10 seconds... My thread is "+ Thread.currentThread())
    Thread.sleep(10000)
    println("I'm awake! I will do my task and return your value! Sorry!")
    1 + 1
  }//This value will execute paralelly when being invoked

  println("Running now: My thread is "+ Thread.currentThread())

  //3 - This is a blocking (blocking is bad)
  val result = Await.result(f, 11 second)


  //4 - This val commented below would give a timeout, because f is sleeping.
  //val timeOutResult= Await.result(f,1 second)

  println("Fuck! Someone block my thread " + Thread.currentThread() + " , val result fuck me up")
    println(result)

}