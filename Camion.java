package EjerciciosClases;

public class Camion extends Vehiculo {
	
	int peso;

	public Camion() {
		super();
		peso=2000;
	}

	public Camion(String c) {
		super(c);
		peso=2000;
	}

	public Camion(int r) {
		super(r);
		peso=2000;
	}

	public Camion(String c, int r, int p) {
		super(c, r);
		peso=2000;
	}

	int getPeso() {
		return peso;
	}
}
