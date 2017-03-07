
package ui

import scala.util.Random
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map
import dominio.Persona

object AppMapas {
  def main(args: Array[String])
  {   
    var mapaPeliculas = Map("Snatch"->3, "Batman"->1, "Superman"->2)
    var mapaPersona:Map[Persona, Int] = scala.collection.mutable.Map[Persona, Int]()
    
    mapaPersona += (new Persona("Luis", 22) -> 1)
    mapaPersona += (new Persona("Javier", 11) -> 3)
    mapaPersona += (new Persona("Luis", 33) -> 4)
    mapaPersona += (new Persona("Luis", 20) -> 0)
    mapaPersona += (new Persona("Manu", 20) -> 3)
    mapaPersona -= (new Persona("Manu", 20))
    
    for( (k,v)<- mapaPersona)
      println(s"Persona: $k - Puntos: $v")
        
    println("=======")
    mapaPersona.filter(x=>x._2>3).foreach(x => println("Persona: " + x._1 + " - Puntos: " + x._2))
    println(mapaPersona.filterKeys(_.edad > 20))
    println("MapValues:" + mapaPersona.mapValues(_+1))
    println("Suma de puntos: " + mapaPersona.values.sum)
    println("Numero de puntuaciones: " + mapaPersona.values.size)
    println("Número de personas con más de dos puntos: " + mapaPersona.count(x => x._2>2))
    println("Suma de puntos: " + mapaPersona.mapValues(x=>x))
    println(mapaPersona.take(2))
    
  }
}