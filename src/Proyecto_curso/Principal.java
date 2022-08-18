package Proyecto_curso;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Television crear_tele= new Television("Power vision", "Hisense", "Negro", "Plasma", "Digital Diseno", "Satelital", "ZN08889", "65", "Pared");
	System.out.println("Descripción de una television ");
	System.out.println("Nombre: "+ crear_tele.getNombre());
	System.out.println("Marca: "+ crear_tele.getMarca());
	System.out.println("Color: "+ crear_tele.getColor());
	System.out.println("Tipo de pantalla: "+ crear_tele.getTipo_pantalla());
	System.out.println("Nombre del modelo: "+ crear_tele.getNombre_modelo());
	System.out.println("Acceso de datos: "+ crear_tele.getAcceso_datos());
	System.out.println("Pulgadas: "+ crear_tele.getPulgadas());
	
	
	

	}

}
