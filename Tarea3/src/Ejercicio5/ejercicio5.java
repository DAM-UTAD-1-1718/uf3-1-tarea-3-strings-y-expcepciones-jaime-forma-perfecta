package Ejercicio5;

import java.util.Scanner;


public class ejercicio5 {
	
	static int resultado=0;
	
	public static void main(String[] args) {
		String respuesta = "";
		Scanner sc=new Scanner(System.in);
		ejercicio5 nuevo=new ejercicio5();
		try {
			resultado= nuevo.calcular(sc);
		}catch (ExcepcionIntervalo ex){
			respuesta = ex.getMessage();
		}
		System.out.println(resultado);
		
	}
	
	public int calcular(Scanner sc) throws ExcepcionIntervalo {
		String cadena;
		int num, resultado = 0;
		System.out.println("Introduce cadena:  ");
		cadena=sc.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			if(Character.isDigit(cadena.charAt(i))) {
				num=Integer.parseInt(cadena.substring(i,i+1));
				resultado=resultado + num;
			}
		}
		if (resultado>20) {
			throw new ExcepcionIntervalo("Fuera de Rango. ", resultado);
		}
		return resultado;
	}
	
class ExcepcionIntervalo extends Exception {
	public ExcepcionIntervalo(String msg, int resultado) {
//		msg = msg + "La Suma es: " + resultado;
		super(msg);
	}
}
}
