

class Persona (nombre: String, edad: Int) {
  //def nom() = nombre
  def ed() = edad
  def nom = nombre
  //def ed = edad
  def > (that:Persona): Boolean = edad > that.ed()
  
  override def toString():String = return nombre + edad

  override def equals(that:Any):Boolean = {
    if(!that.isInstanceOf[Persona])
    	sys.error("No es clase Persona")

    that.isInstanceOf[Persona] && {
        val p = that.asInstanceOf[Persona]
        p.nom == nombre && p.ed() == edad
      }
  }  
}