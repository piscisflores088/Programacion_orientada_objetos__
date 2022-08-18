package Arrays;

import java.util.Scanner;

public class Arrays_ejercicio1 {
	
	public static void main(String[] args) {
	     
	    Scanner leer=new Scanner (System.in);
	       int entero [] =new int [10];
	       int entero2 []=new int [10];
	       int sum;
	       System.out.println("introduce los valores 1");
	       
	       for (int e=0; e<10;e++){
	           System.out.println("ingresa el primer valor para la posicion ["+e+"]");
	           entero[e]=leer.nextInt();
	       }
	       {
	        System.out.println("\n valores del primer arreglo");
	        for(int e=0; e<10; e++)
	            System.out.println("el valor obtenido["+e+"]:"+entero[e]);
	       }
	       System.out.println("\n valores del segundo arreglo");
	       for (int e=0; e<10;e++){
	           System.out.println("ingresa el primer valor para la posicion ["+e+"]");
	           entero2[e]=leer.nextInt();
	       } 
	           System.out.println("\n valores obtenidos 2");
	        for (int e=0; e<10;e++) {
	           System.out.println("\n valor ["+e+"]:"+entero2[e]);
	        }
	        for (int e=0; e<10; e++){
	            sum = entero[e]+entero2[e];{
	            System.out.println("\n el resultado de la suma de los dos arreglos es ["+sum+"]");
	        }
	        }
	        }
	}


