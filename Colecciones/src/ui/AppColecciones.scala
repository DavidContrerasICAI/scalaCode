
package ui

import scala.collection.mutable.ListBuffer
import scala.util.Random

object AppColeciones {
  def main(args: Array[String])
  {   
    var lista = List("hola", "adios", "campeon")

    var lista2:List[String] = List()
    lista2 = "hola" :: "adios" :: "campeon" :: Nil
    
    lista2.foreach(println)
    lista.foreach(s=>println(s))
      
    for(elemento <- lista2)
    	println(s"Elemento: $elemento")
    	
    for (palabra <- lista if palabra.length()<6)
      println(palabra)
      
    var listaNumerosAleatorios:ListBuffer[Int]= Random.shuffle(ListBuffer(7, 3, 6, 9, 1))
    listaNumerosAleatorios += 2
    listaNumerosAleatorios += 6
    println(listaNumerosAleatorios)
    println(listaNumerosAleatorios.sortWith(_<_))
    listaNumerosAleatorios.sortWith(_<_).groupBy(x=>x).map(kv => (kv._1, kv._2.count(x=>true))).toSeq.sortWith(_._1<_._1).foreach(kv=> println("El número " + kv._1 + " aparece " + kv._2 + " veces"))
      
  }
}