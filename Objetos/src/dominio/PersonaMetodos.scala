package dominio 

class PersonaMetodos  (private var _nombre: String, var _edad: Int) { //Por defecto son val y con visibilidad package
  def nombre = _nombre
  def nombre_=(unNombre:String) = this._nombre = unNombre
  
  def edad = _edad
  def edad_=(unaEdad:Int) = if(_edad>0) this._edad = unaEdad

  def > (that:PersonaMetodos): Boolean = this._edad > that.edad
  def isMayor:Boolean = edad >= 18
  
  override def toString():String = return this._nombre + _edad //Con o sin this
  //override def toString():String = return nombre + edad //Mediante una evaluación lazy de la definición

  override def equals(that:Any):Boolean = {
    if(!that.isInstanceOf[PersonaMetodos])
    	sys.error("No es clase Persona")

    that.isInstanceOf[PersonaMetodos] && {
        val p = that.asInstanceOf[PersonaMetodos]
        p.nombre == _nombre && p.edad == _edad
      }
  }  
}