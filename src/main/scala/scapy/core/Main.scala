package scapy.core

import akka.actor.Actor

class Main extends Actor {
  
  def receive = {
    case "run" => println("running...")
  }

}