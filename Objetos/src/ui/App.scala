package ui

import dominio.PersonaJava
import dominio.Persona
import dominio.PersonaScalaBase
import dominio.PersonaScalaBean

object App {
  def main(args: Array[String])
  {    
    val personaJava = new PersonaJava("Luis", 22)
    val persona = new Persona("Luis", 22)
    val personaScalaBase = new PersonaScalaBase("Luis", 22)
    val personaScalaBean = new PersonaScalaBean("Luis", 22)
    
    personaJava.setEdad(12)
    println(personaJava.getEdad())
    
    persona.edad = 12;
    println(persona.edad)
    
    personaScalaBase.edad = -99;
    personaScalaBase._edad = 1 //Lo permite porque el atributo no está definido como private, _nombre si
    println(personaScalaBase.edad)
    
    personaScalaBean.edad = 12;
    println(personaScalaBean.edad)
    println(personaScalaBean.getEdad())
    
  }
}