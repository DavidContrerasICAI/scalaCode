package ui

import dominio.ReferenciaTipificada
import dominio.PersonaMetodos

object AppMetodos {
  def main(args: Array[String])
  {    
    val persona1 = new PersonaMetodos("Luis", 22)
    val persona2 = new PersonaMetodos("Manuel", 33)
    println(persona2 > persona1) 
    println(persona1.isMayor)
  
    //println(persona1.equals("Hola")) //Lanza una RuntimeException
    
    var numeroObjeto = new ReferenciaTipificada[Int]
    numeroObjeto.set(34)
    println("Numero Tipificado:" + numeroObjeto.get)
  }
}