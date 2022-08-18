package Listas;

import java.util.ArrayList;

public class Practica_listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lista__marcas_laps=new ArrayList<String>();
		
		lista__marcas_laps.add("LENOVO");
		lista__marcas_laps.add("HP");
		lista__marcas_laps.add("HUAWEI");
		lista__marcas_laps.add("DELL");
		
		System.out.println("Marcas Laptops"+ lista__marcas_laps);
		//Los arreglos son 4 y empiezan de 0 a 3
		System.out.println(lista__marcas_laps.get(2));
		
		System.out.println(lista__marcas_laps.size());//tamaño de elementos se usa size
		
			lista__marcas_laps.remove(1);//remove eliminar elementos
 		System.out.println(lista__marcas_laps);
		// set = establecer
		lista__marcas_laps.set(2, "TOSHIBA");
		System.out.println(lista__marcas_laps);
		
		for(String i: lista__marcas_laps) {
			System.out.println(i);
		}
		
	}

}
