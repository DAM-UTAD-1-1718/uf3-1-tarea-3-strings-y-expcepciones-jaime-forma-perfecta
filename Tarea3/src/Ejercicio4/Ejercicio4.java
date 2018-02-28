package Ejercicio4;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio4 {
	static int calcular(String array[], int array1[])
			throws  NumberFormatException {	
		int total=0;
	for (int i = 0; i<array.length; i++) {
		array1[i]=Integer.parseInt(array[i]);
	}
	for (int i = 0; i<array.length; i++) {
		total = array1[i]+array1.length-i;
	}
	return (total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;
		String array[] = new String[5];
		int array1[] = new int[5];
		int suma;
		int i = 0;
		while(i<5) {
			System.out.println("Introduce número "+ i);
			String num = sc.next();
			array[i]= num;
			try {
				suma = calcular(array, array1);
				respuesta = suma;
				i++;
			} catch (NumberFormatException ex) {
			}
			
		}

		
		System.out.println("La respuesta es: " + respuesta);

	}
}

 class ExcepcionIntervalo extends Exception {
	public ExcepcionIntervalo(String msg) {
		super(msg);
	}
 }
