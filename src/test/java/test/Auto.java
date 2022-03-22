package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[10];
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;

	int cantidadAsientos() {
		int count = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (this.asientos[i] != null) {
				count++;
			}
		}
		return count;

	}

	void verificarIntegridad() {
		boolean integridad = true;
		
		if (this.registro != motor.registro) {
			integridad = false;
		}

		for (int i = 0; i < cantidadAsientos(); i++) {
			if (this.registro != asientos[i].registro) {
				integridad = false;
			}
		}
		if (integridad == false) {
			System.out.println("Las piezas no son originales");
		} else {
			System.out.println("Auto original");
		}
	}

}