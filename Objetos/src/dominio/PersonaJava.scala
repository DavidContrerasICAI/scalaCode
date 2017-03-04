package dominio

class PersonaJava () {
  private var nombre:String = ""
  private var edad:Int = 0

  def this(nombre: String, edad: Int) = {  
    this()  
    this.nombre = nombre
    this.edad = edad
  }  
    
  def getName() = this.nombre  
  def setName(nombre:String) = this.nombre = nombre
  
  def getEdad() = this.nombre  
  def setEdad(edad:Int) = {
      if(edad>0) 
         this.edad = edad
    }

}