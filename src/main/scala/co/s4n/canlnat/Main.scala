package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
  def leerInt(prompt:String):Int = {
    val s = StdIn.readLine(prompt)
    s.toInt
  }
  
  def esCero(nat:Nat) = nat match {
    case Cero() => true
    case Suc(nat) => false
  }
  
  def esMAyorIgual(nat1:Nat, nat2:Nat):Boolean = nat1 match {
    case Cero() => nat2 match {
      case Cero() => true
      case _      => false
    }
    case Suc(pnat) => nat2 match {
      case Cero() => true
      case Suc(snat) => esMayorIgual(pnat, snat)
    }
  }
  
  val input = leerInt("Leer primer entero")
  val input2 = leernt("Leer segundo entero")
  
  def conIntANat(i:Int):Nat = (a:Int):Nat => a
  conIntANat(input)
  def imprimirNAt (nat :Nat): String =
  def restaNAt(nat1:Nat, nat2:Nat):Nat =  
}



