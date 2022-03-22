package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
			}
	void asignarTipo(String tipo) {
		if(this.tipo == "electrico") {
			this.tipo = tipo;
		}
		if(this.tipo == "gasolina") {
			this.tipo = tipo;
		}
		
		
	}
}