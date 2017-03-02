
import java.util.ArrayList

object App {
  def main(args: Array[String])
  {
    println("Hello, world!")
    
    val persona1 = new Persona("Luis", 22)
    val persona2 = new Persona("Manuel", 33)
    println(persona2 > persona1) 
    println(persona1)
    //println(persona1.equals("Hola")) //Lanza una RuntimeException
    
    var numeroObjeto = new ReferenciaTipificada[Int]
    numeroObjeto.set(34)
    println(numeroObjeto.get)
    
    var lista = List("hola", "adios", "campeon")

    var lista2:List[String] = List()
    lista2 = "hola" :: "adios" :: "campeon" :: Nil
    
    lista2.foreach(println)
    
    lista.foreach(s=>println(s))
      
    for(s <- lista2){
        println(s)
    }
  }
}