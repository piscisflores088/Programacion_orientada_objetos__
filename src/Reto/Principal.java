package poo_Inicio;

import javax.swing.JOptionPane;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU crear_cpu= new CPU
("HP", "INTEL", "NEGRO", "500 GB", 2);

		System.out.println("Datos CPU 1");
		System.out.println("Marca CPU: " + crear_cpu.getMarca());
		System.out.println("Procesador CPU: " + crear_cpu.getProcesador());
		System.out.println("Almacenamiento CPU: " + crear_cpu.getCapacidad_alm());
		System.out.println("Numero proc. CPU: " + crear_cpu.getNum_procesador());

		System.out.println("Datos CPU 2");
		CPU cpu2 = new CPU("LENOVO", "AMD", "GRIS", "256 GB", 4);
		System.out.println("Marca CPU: " + cpu2.getMarca());
		cpu2.setMarca("ACER");
		cpu2.setCapacidad_alm("1 TB");
		System.out.println("Marca CPU: " + cpu2.getMarca());
		System.out.println("Almacenamiento CPU: " + cpu2.getCapacidad_alm());
		
		/*
		 * JOptionPane.showDiaLog(null, "Marca computadora:" + crear_cpu.getMarca() +
		 * "Marca CPU:" + crear_cpu.getCapacidad_alm());
		 */

	}

}
