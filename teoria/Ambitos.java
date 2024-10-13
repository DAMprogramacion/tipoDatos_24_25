public class Ambitos {
	
	static int a = 1; //variable de clase
	//System.out.println("Variable a: " + a); aquí no puede haber sout
	
	public static void main (String[] args) {
		int b = 2; //variable local
		System.out.println("Variable a: " + a);
		System.out.println("Variable b: " + b);
		System.out.println("=================");
		{
			int c = 3;//varriable de ámbito
			System.out.println("Variable a: " + a);
			System.out.println("Variable b: " + b);
			System.out.println("Variable c: " + c);
			System.out.println("=================");
			{
				int d = 4;//variable de ámbito
				System.out.println("Variable a: " + a);
				System.out.println("Variable b: " + b);
				System.out.println("Variable c: " + c);
				System.out.println("Variable d: " + d);
				System.out.println("=================");
			}
			{
				//int d = 5;//se puede hacer, no colisiona con el ámbito anterio
				int e = 4;
				System.out.println("Variable a: " + a);
				System.out.println("Variable b: " + b);
				System.out.println("Variable c: " + c);
				System.out.println("Variable e: " + e);
				System.out.println("=================");
			}

		}
	}
}

