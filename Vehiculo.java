package EjerciciosClases;

public abstract class Vehiculo {
	
	String color;
	int ruedas;
	
	Vehiculo(){
		color="Blanco";
		ruedas=4;
	}
	
	Vehiculo(String c){
		color=c;
		ruedas=4;
	}
	
	Vehiculo(int r){
		color="Blanco";
		ruedas=r;
	}
	
	Vehiculo(String c, int r){
		color=c;
		ruedas=r;
	}
	
	String getColor(){
		return color;
	}
	
	int getRuedas() {
		return ruedas;
	}
	
	void setColor(String c){
		color=c;
	}
	
	void setRuedas(int r) {
		ruedas=r;
	}
	

	public static void main(String[] args) {
		
		// Al ser clase abstracta no se pueden crear objetos de clase Vehiculo directamente
		
		// Coches
		Coche coche1, coche2, coche3;
		
		// Camiones
		Camion camion1, camion2, camion3;
		
		coche1 = new Coche();
		System.out.println("Coche1 es de color: " + coche1.getColor());
		System.out.println("Coche1 tiene ruedas: " + coche1.getRuedas());
		System.out.println("Coche1 tiene asientos: " + coche1.getAsientos());
		
		coche2 = new Coche("Azul");
		System.out.println("Coche2 es de color: " + coche2.getColor());
		System.out.println("Coche2 tiene ruedas: " + coche2.getRuedas());
		System.out.println("Coche2 tiene asientos: " + coche2.getAsientos());
		
		coche3 = new Coche("Negro", 3, 2);
		System.out.println("Coche3 es de color: " + coche3.getColor());
		System.out.println("Coche3 tiene ruedas: " + coche3.getRuedas());
		System.out.println("Coche3 tiene asientos: " + coche3.getAsientos());
	
		camion1 = new Camion();
		System.out.println("Camion1 es de color: " + camion1.getColor());
		System.out.println("Camion1 tiene ruedas: " + camion1.getRuedas());
		System.out.println("Camion1 tiene peso: " + camion1.getPeso());
		
		camion2 = new Camion("Amarillo");
		System.out.println("Camion2 es de color: " + camion2.getColor());
		System.out.println("Camion2 tiene ruedas: " + camion2.getRuedas());
		System.out.println("Camion2 tiene asientos: " + camion2.getPeso());
		
		camion3 = new Camion("Rosa", 6, 3500);
		System.out.println("Camion3 es de color: " + camion3.getColor());
		System.out.println("Camion3 tiene ruedas: " + camion3.getRuedas());
		System.out.println("Camion3 tiene peso: " + camion3.getPeso());
	
		
		
	}

}
