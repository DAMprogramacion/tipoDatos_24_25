


public class Literales {
	
	public static void main (String[] args) {
		
		//binarios, octales y hexadecimales
		int numeroBinario = 0b00100001;
		System.out.println("Valor decimal de 0b00100001 es: " + numeroBinario);
		
		int numeroOctal = 01234;
		System.out.println("Valor decimal de 01234 es: " + numeroOctal);
		
		int numerHexadecimal = 0x1a2;
		System.out.println("Valor decimal de 0x1a2 es: " + numerHexadecimal);
		
		long multiplicacion = numeroBinario * numeroOctal * numerHexadecimal;
		System.out.println("Valor de la multiplicación: " + multiplicacion);
		
		//underscores
		int millon  = 1_000_000;
		long billon = 1_000_000_000_000L;
		multiplicacion = millon * billon;
		System.out.println("Valor de la multiplicación: " + multiplicacion);
		
		//notación científica
		double valor = 6.7e-25;
		System.out.println("Valor notación científica: " + valor);
		valor = 2e5;
		System.out.println("Valor notación científica: " + valor);

		
		
		
		
		
		
		
		
		
	}
}

