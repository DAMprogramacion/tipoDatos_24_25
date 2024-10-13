//(0 °C × 9 / 5) + 32 = 32 °F

public class ConversionTemperatura {
	
	public static void main (String[] args) {
		
		float gradosCentigrados = 15.5f;
	//	int   gradosFarenheits  = (int) ((9/5 * gradosCentigrados ) + 32); 9/5 daría 1, nos genera mal cálculo
	//	double gradosFarenheits = (9.0/5 * gradosCentigrados ) + 32; forma para solucionarlo para una double
		int   gradosFarenheits  = (int) ((gradosCentigrados * 9/5) + 32);
		
		System.out.println(gradosCentigrados + "ºC son: " + gradosFarenheits);
	}
}

