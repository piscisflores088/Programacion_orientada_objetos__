package HERENCIA;

public class Bebidas extends Producto {
	
	private String Sabor;
	private String Presentacion;
	
	public Bebidas(String nombre, String codigo, double precio, String marca, String tipo, String sabor,
			String presentacion) {
		super(nombre, codigo, precio, marca, tipo);
		Sabor = sabor;
		Presentacion = presentacion;
	}
	public String getSabor() {
		return Sabor;
	}
	public void setSabor(String sabor) {
		Sabor = sabor;
	}
	public String getPresentacion() {
		return Presentacion;
	}
	public void setPresentacion(String presentacion) {
		Presentacion = presentacion;
	}

	
}
