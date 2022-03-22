package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
			}
	public void asignarTipo(String tipo) {
		if(this.tipo == "electrico") {
			this.tipo = tipo;
		}
		else if(this.tipo == "gasolina") {
			this.tipo = tipo;
		}
		
	}
}