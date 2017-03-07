
package ui

import scala.util.Random
import scala.collection.mutable.ListBuffer
import dominio.Persona

object AppFuncionesAgregacion {
  def main(args: Array[String])
  {   
    var listaNumeros = List(1, 2, 3, 4, 5)
    println("Reduce Max: " + listaNumeros.filter(_ < 4).map(_ * 10).reduce(_ max _))
    println("Suma Reduce: " + listaNumeros.filter(_ < 4).map(_ * 10).reduce(_ + _))
    println("Suma Fold 20: " + listaNumeros.filter(_ < 4).map(_ * 10).fold(20)(_ + _))
    println("Suma ReduceLeft Dividir: " + listaNumeros.filter(_ < 4).map(_ * 10).reduceLeft(dividir))
    println("Suma ReduceRight Dividir: " + listaNumeros.filter(_ < 4).map(_ * 10).reduceRight(dividir))
    println("ScanLeft Dividir: " + listaNumeros.filter(_ < 4).map(_ * 10).scanLeft(1)(dividir))
    println("ScanRight Dividir: " + listaNumeros.filter(_ < 4).map(_ * 10).scanRight(1)(dividir))
    
    
    
    println("Reduce inline: " + listaNumeros.filter(_ < 4).map(_ * 10).reduce((x, y) => if(x%2==0) y + x else x))

    var suma = 0
    listaNumeros.foreach(suma += _)
    println(suma)
    
    var listaNumerosAleatorios:ListBuffer[Int]= Random.shuffle(ListBuffer(7, 3, 6, 9, 1))
    println(listaNumerosAleatorios)
    println(listaNumerosAleatorios.sortWith(_<_))
    
    var personas:ListBuffer[Persona] = ListBuffer[Persona]()
    
    personas += new Persona("Luis", 22)
    personas += new Persona("Javier", 11)
    personas += new Persona("Luis", 33)
    personas += new Persona("Luis", 20)
    personas += new Persona("Manu", 20)
    personas -= new Persona("Manu", 20)
    
    println(personas.groupBy(_.edad))

  }
  
  val dividir = (x:Int, y:Int) =>
  {
    val resultado = y/x
    println(s"$y/$x=$resultado")
    resultado
  }
}