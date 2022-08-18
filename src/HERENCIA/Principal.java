package HERENCIA;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bebidas crear_bebida= new Bebidas("COCA COLA", "B1", 13, "COCA-COLA", "BEBIDA", "COCA", "LATA");
		System.out.println("Nombre producto: " + crear_bebida.getNombre());
		System.out.println("Marca producto: " + crear_bebida.getMarca());
		System.out.println("Sabor producto: " +  crear_bebida.getSabor());
		
		System.out.println("Lacteos");
		Lacteos crear_lacteos= new Lacteos("Leche semidescremada", "645644645624644", 25, "LALA", "Leche", "30/07/2022", 0.20);
		System.out.println("Nombre del producto: "+ crear_lacteos.getNombre());
		System.out.println("Codigo del producto: " + crear_lacteos.getCodigo());
		System.out.println("Precio del producto: "+ crear_lacteos.getPrecio());
		System.out.println("Marca del producto: "+ crear_lacteos.getMarca());
		System.out.println("Tipo del producto: "+ crear_lacteos.getTipo());
		System.out.println("Fecha de caducidad: " + crear_lacteos.getFecha_caducidad());
		System.out.println("Descuento del producto: "+ crear_lacteos.getDescuento()+"%");
		
		System.out.println("Precio real lacteos");
		System.out.println(crear_lacteos.calcular_precio(crear_lacteos.getPrecio(),crear_lacteos.getDescuento()));
	}
	///Lacteos crear_lacteos= new Lacteos("Leche semidescremada", "645644645624644", 25, "LALA", "Leche", "30/07/2022", 0.20);
	
}
