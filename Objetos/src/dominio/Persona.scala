package dominio

class Persona (n: String, e: Int) {
  private var _nombre:String = n
  private var _edad:Int = e
  
  def edad=this._edad
  def edad_=(_edad: Int) = if(_edad>0) this._edad = _edad
  
  def nombre=this._nombre
  def nombre_=(_nombre: String) = this._nombre = _nombre
}