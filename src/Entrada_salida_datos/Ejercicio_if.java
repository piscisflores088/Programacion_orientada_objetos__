package Practicas_curso_poo;

import java.util.Scanner;

public class Ejercicio_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner captura_datos=new Scanner (System.in);
		String curso="POO";
		System.out.println("Anota el promedio: ");
		String prom=captura_datos.nextLine();
		
		
		if (Integer.parseInt(prom)>=70 && curso=="POO") 
		
		{
			System.out.println("Bienvenido al curso de POO");
	}	else {
		System.out.println("No aprovaste la materia");
	}

	}
}