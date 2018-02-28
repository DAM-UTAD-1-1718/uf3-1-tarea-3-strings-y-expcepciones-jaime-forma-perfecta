package Ejercicio1;
/**
*@autor Guillermo Crespo
*/
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
static int sum=0;
static int aux2=0;
static char auxnum=0;
static int i=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nif = sc.next();
		
		Stack<Integer> digits = new Stack<Integer>();
		// TODO Apéndice de método generado automáticamente
		if (isNumeric(nif) == true) {// Validamos que los primeros 8 digitos sean numeros
			int num = Integer.parseInt(nif);// Convertimos los 8 primeros digitos a numeros
			
			// suma de la descomposición
			for (Integer elto : digits) {
				sum+= elto;
			}
		}
		System.out.println(sum);
	}

	private static boolean buscarnumero(String nif) {
		  Stack<Character> digits = new Stack<Character>();
		// TODO Apéndice de método generado automáticamente
		 boolean esnumero = false;
		    char[] array = nif.toCharArray();
		    for (char caracter : array){
		        if ( Character.isDigit(caracter) )
		        	esnumero = true;
		        if(esnumero==true) {
		        	digits.add(caracter);
		        	auxnum=digits.get(i);
		        	aux2=auxnum;
		        }
		        
		       
		        System.out.println(aux2);
		        i++;
		    }   
		 
		    return esnumero;
	}

	public static boolean isNumeric(String nif) {
		boolean resultado;

		try {
			Integer.parseInt(nif);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			buscarnumero(nif);
			resultado = false;
		}

		return resultado;
	}
	

}
