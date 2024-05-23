
public class TablaBidimensional {

	public static void main(String[] args) {
		 		int[][] tabla = new int [10][10];
		 		int aleatorio = (int) Math.floor(Math.random()* 1000); // de 0 a 990
		  
				  for(int i=0;i<tabla.length;i++) {
					  for(int j=0;j<tabla[i].length;j++) {
						  	aleatorio = (int) Math.floor(Math.random()* 1000); // de 0 a 999
				  			tabla [i][j] = aleatorio;
				  			aleatorio = (int) Math.floor(Math.random()* 1000); // de 0 a 999
					  }
				  }
				  
				  	int maximo = tabla[0][0];
					int posmaxFila = 0;
					int posmaxColumna = 0;
					
				

					
					//Mostramos la tabla
					for	(int i = 0;i<tabla.length;i++) {
						System.out.println("Fila: " + (i+1));
						System.out.println("\n");
					for(int j = 0;j<tabla[0].length;j++) {
						System.out.println("Columna " + (j+1) +" : " + tabla[i][j]);
					}
					System.out.println("\n");

					}
				
					//Calculamos el máximo
					for(int i=0;i<tabla.length;i++) {
						for(int j=0;j<tabla[i].length;j++) {
							if(tabla[i][j] > maximo) {
								maximo = tabla[i][j];
								posmaxFila = (i + 1);
								posmaxColumna = (j + 1);
							}
						}
					}
				
					System.out.println("El número máximo de este array bidimensional es : " + maximo);
					System.out.println("En la posicion de fila " + posmaxFila);
					System.out.println("En la posicion de columna " + posmaxColumna);
					System.out.println("\n");
				
					//Calculamos la suma y la media de los valores por encima de 500
					int sum = 0;
					int cantidadCumplenCondicion = 0;
					for (int i = 0; i < tabla.length; i++) {
						for (int j = 0; j < tabla[i].length; j++) {
							if(tabla[i][j] > 500) {
								sum += tabla[i][j];
								cantidadCumplenCondicion ++;
								System.out.println(tabla[i][j] + " es mayor a 500");
							}
						}
					}
					System.out.println("\n");
					double media = (double) sum / (cantidadCumplenCondicion);
		        
					System.out.println("Cantidad de valores por encima de 500: " + cantidadCumplenCondicion);
					System.out.println("Suma toal de valores encima de 500: " + sum);
					System.out.println("Media toal de valores encima de 500: " + media);

	}

}
