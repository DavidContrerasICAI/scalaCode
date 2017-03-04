package dominio
import beans._  

class PersonaMetodos (@BeanProperty var nombre: String, @BeanProperty var edad: Int)
{  
  def > (that:PersonaMetodos): Boolean = edad > that.edad
  def isMayor:Boolean = edad >= 18
  
  override def toString():String = return nombre + edad

  override def equals(that:Any):Boolean = {
    if(!that.isInstanceOf[PersonaMetodos])
    	sys.error("No es clase Persona")

    that.isInstanceOf[PersonaMetodos] && {
        val p = that.asInstanceOf[PersonaMetodos]
        p.nombre == nombre && p.edad == edad
      }
  }  
}