package Practicas_curso_poo;

import java.util.Scanner;

public class Sentencia_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura_datos=new Scanner(System.in);
		int edad;
		System.out.println("Introduce tu edad");
		edad=captura_datos.nextInt();
		if(edad>=18) {
			System.out.println("Mayor de edad");
			
		}else {
			System.out.println("Menor de edad");
		}
	}

}
