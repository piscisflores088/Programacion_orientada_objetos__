package Sentencias_de_control;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner captura_datos=new Scanner(System.in);
		
		int cal1, cal2, cal3, cal4;
		
		System.out.println("Introduce la primera, segunda, tercera y ultima calificacion: " );
		cal1=captura_datos.nextInt();
		cal2=captura_datos.nextInt();
		cal3=captura_datos.nextInt();
		cal4=captura_datos.nextInt();
		double prom=(cal1+cal2+cal3+cal4)/4;
		System.out.println("Tu promedio es: "+prom);
		if (prom>=70) {
			System.out.println("¡Felicidades!, has aprobado la materia");
		}else {
			System.out.println("Estás reprobado");
		}
	}

}
