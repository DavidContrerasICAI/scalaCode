

class ReferenciaTipificada[T] {
    private var atributo:T = _
    
    def set(valor:T) {atributo = valor}
    def get:T = atributo
}