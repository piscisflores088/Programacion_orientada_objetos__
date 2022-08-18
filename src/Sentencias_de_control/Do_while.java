package Sentencias_de_control;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner captura_datos=new Scanner(System.in);
		int num1, num2;
		double opcion=0;
		double exit = 0;
		do {
			System.err.println("");
			System.out.println("Selecciona una operación: ");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("0. Exit");
			
			if (opcion==1);
			num1=captura_datos.nextInt();
			num2=captura_datos.nextInt();
			
			
		}while(exit != 0);
	}

}
