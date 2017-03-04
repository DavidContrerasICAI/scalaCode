package dominio

class PersonaScalaBase (private var _nombre: String, var _edad: Int) { //Por defecto son val y con visibilidad package
  def nombre = _nombre
  def nombre_=(_nombre:String) = this._nombre = _nombre
  
  def edad = _edad
  def edad_=(_edad:Int) = if(_edad>0) this._edad = _edad
}