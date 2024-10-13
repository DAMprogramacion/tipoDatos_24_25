
public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		float millasRecorridas1    = 100;
		final float MILLAS_KILOMETRO1      = 1.609f;
		double kilometrosRealizados1 = millasRecorridas1 * MILLAS_KILOMETRO1;
		//100 millas son 160.934 km
		System.out.println(millasRecorridas1 + " millas son " + kilometrosRealizados1 + " km");
	
		//cambiado los tipos
		double millasRecorridas2    = 100;
		final double MILLAS_KILOMETRO2      = 1.609;
		float kilometrosRealizados2 =  (float) (millasRecorridas2 * MILLAS_KILOMETRO2);
		//100 millas son 160.934 km
		System.out.println(millasRecorridas2 + " millas son " + kilometrosRealizados2 + " km");
	
		//NO LO PIDE EL EJERCICIO
		//MÁXIMA PRECISIÓN POSIBLE, DECLARAR kilometrosRealizados COMO double
		double millasRecorridas3    = 100;
		final double MILLAS_KILOMETRO3      = 1.609;
		double kilometrosRealizados3 =  millasRecorridas3 * MILLAS_KILOMETRO3;
		//100 millas son 160.934 km
		System.out.println(millasRecorridas3 + " millas son " + kilometrosRealizados3 + " km");
		
		
	
	}
}

