package Practicas_curso_poo;

import java.util.Scanner;

public class Entrada_salida_de_datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura_datos= new Scanner(System.in);
		
		System.out.println("Anota numero 1: ");
		String numero1=captura_datos.nextLine();
		
		System.out.println("Anota numero 2: ");
		String numero2=captura_datos.nextLine();
		int suma=Integer.parseInt(numero1)+Integer.parseInt(numero2);
		
		System.out.println("La suma es: " +suma);
		
		
	}

}
