package WebServer

import akka.actor.Actor

class MyActor extends Actor {
  override def receive: Receive = {
    case "test" => println("Test successfull!")
    case _ => println("Test unsuccessfull")
  }
}
