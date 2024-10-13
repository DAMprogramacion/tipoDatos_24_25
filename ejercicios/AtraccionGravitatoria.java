

public class AtraccionGravitatoria {
	
	public static void main (String[] args) {
		
		final double GRAVITACION_UNIVERSAL = 6.67e-11;
		double masa1  = 5.94e24;  //masa de la Tierra
		double masa2  = 7.35e22;  //masa de la Luna
		long distancia = 384_000_000;  //distancia Tierra-Luna en SI
		double fuerza = GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow(distancia, 2);
		
		System.out.println("La atracción Tierra-Luna vale " + fuerza + "N");
		
		masa2 = 1.99e30; //masa del Sol
		distancia = 150_000_000_000L; //distancia Tierra-Sol
		fuerza = GRAVITACION_UNIVERSAL * masa1 * masa2 / Math.pow(distancia, 2);
		
		System.out.println("\nLa atracción Tierra-Sol vale " + fuerza + "N");


		
		
		
	}
}

