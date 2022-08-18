package Arrays;

import java.util.Scanner;

public class Arrays_ejercicio2 {

    public static void main(String[] args) {
      Scanner inicio = new Scanner (System.in);
      char dato [] = new char [10];
      
      System.out.println("ingresa los datos en el arreglo");
      
      for (int e=0; e<10;e++){
      System.out.println("digita el primer caracter para la posicion ["+e+"]");
      dato[e]= inicio.next().charAt(0);
    }
      System.out.println("imprimir el arreglo en forma inversa: ");
      
      int f =9;
      while (f>0)
      {
          System.out.println("valor de ["+f+"]:"+dato[f]);
          f--;
      }
    }
    
}


