package practica_poo;

public class Principal_ropas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ropas crear_ropas= new Ropas
("Caballeros", "Pantalones", "Negro", 30, 350);
		System.out.println("Opcion venta de ropa 1: ");
		System.out.println("Ropas para: " + crear_ropas.getSexo());
		System.out.println("Tipo de ropa: " + crear_ropas.getTipo());
		System.out.println("Color de ropa: " + crear_ropas.getColor());
		System.out.println("Talla de la ropa: " + crear_ropas.getTalla());
		System.out.println("Precio de la ropa: $"+ crear_ropas.getPrecio());
		
		
		
	}

}
