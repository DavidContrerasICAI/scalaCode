
package ui

object AppColleciones {
  def main(args: Array[String])
  {   
    var lista = List("hola", "adios", "campeon")

    var lista2:List[String] = List()
    lista2 = "hola" :: "adios" :: "campeon" :: Nil
    
    lista2.foreach(println)
    lista.foreach(s=>println(s))
      
    for(s <- lista2)
        println(s)
  }
}