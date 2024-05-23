package EjerciciosClases;

public class Coche extends Vehiculo {
	
	int asientos;

	public Coche() {
		super();
		asientos=5;
	}

	public Coche(String c) {
		super(c);
		asientos=5;
	}

	public Coche(int r) {
		super(r);
		asientos=5;
	}

	public Coche(String c, int r, int a) {
		super(c, r);
		asientos=a;
	}

	int getAsientos() {
		return asientos;
	}
}
