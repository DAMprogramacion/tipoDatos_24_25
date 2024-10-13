


public class CaidaLibre {
	
	public static void main (String[] args) {
		
		final double GRAVEDAD = 9.8;
		double altura = 1;
		double tiempo = Math.sqrt(2 * altura / GRAVEDAD);
		
		System.out.println("Un cuerpo que cae desde " + altura + "m tarda " + tiempo + "s"); 
		
		altura = 2.5;
		tiempo = Math.sqrt(2 * altura / GRAVEDAD);
		
		System.out.println("Un cuerpo que cae desde " + altura + "m tarda " + tiempo + "s"); 

	}
}

