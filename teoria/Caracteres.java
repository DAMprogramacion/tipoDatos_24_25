


public class Caracteres {
	
	public static void main (String[] args) {
		
		//System.out.println("Hola: "mundo""); no funciona
		System.out.println("Hola: 'mundo'");  //solución 1
		//System.out.println("Hola: \u0022mundo\u0022");  solución 2 no funciona
		System.out.println("Hola: \"mundo\"");
		
		//nos piden que ahora salga entre barras
		System.out.println("\\hola mundo\\"); 
		
		//probando el tabulador
		System.out.println("Hola\tmundo");
		
		//probando el salto de línea
		System.out.println("Hola\nmundo\nHello\nworld");
		
		//¿Cuál será las siguiente salidas?
		System.out.println("\nn\n");
		System.out.println("\\nn\\n");
		System.out.println("\\\nn\\\n");
		System.out.println("\\\\nn\\\\n");

		
		
		
		
	}
}

