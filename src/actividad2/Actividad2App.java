package actividad2;

public class Actividad2App {

	public static void main(String[] args) {
		
		// declaración de las variables,		
		int N = 100;
		double A = 999.3;
		char C = 'v';
		
		//mostramos valores de cada variable,
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + C);
		
		//La suma de N + A
		System.out.println(N + " + " + A + " = " + (N + A));
		
		//La diferencia de A - N
		System.out.println(A + " - " + N + " = " + (A - N));
		
		//El valor numérico correspondiente al carácter que contiene la variable C.
		System.out.println("Valor numérico del carácter " + C + " = " + (int) C);
	}

}
