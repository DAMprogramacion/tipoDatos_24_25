

public class ConversionMoneda {
	
	public static void main (String[] args) {
		
		final double UN_DOLAR_A_EUROS = 0.91;
		double dolares = 10;
		double euros   = dolares * UN_DOLAR_A_EUROS;
		
		System.out.println(dolares + "$" + " son: " + euros + "€"); 
	}
}

