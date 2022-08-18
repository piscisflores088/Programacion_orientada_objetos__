package Arrays;

import java.util.Scanner;

public class Arrays_ejercicio3 {
	public static void main(String[] args) {
        
	       Scanner leyendo = new Scanner (System.in);
	       int d,e,mun,b;
	       int nuevoa[] =new int[20];
	       System.out.println("introduce el cantidad del arreglo");
	       d= leyendo.nextInt();
	       for(e=0;e<d;e++){
	           System.out.println("el valor de la posicion ["+(e+1)+"]=");
	           nuevoa[e]=leyendo.nextInt();
	       }
	       System.out.println("\n arreglos sin valores invertidos:");
	       for(int f=0;f<d;){
	           System.out.println("\n valor de la posicion ["+(f+1)+"]="+(nuevoa[f])+"");
	           f++;
	       }
	       b=d;
	       for(e=0;e<=b/2;e++){
	           mun=nuevoa[e];
	           nuevoa[e]=nuevoa[b-1];
	           nuevoa[b-1]=mun;
	           b--;
	       }
	       System.out.println("\n el arreglo en valores invertidos: ");
	       for(e=0;e<d;){
	           System.out.println("\n el valor de la posicion ["+(e+1)+"]=" +(nuevoa[e])+"");
	           e++;
	       }
	       
	    }
	    
	}


