package HERENCIA;

public class Producto {
	///abstraccion. Atributos
	private String Nombre;
	private String Codigo;
	private double Precio;
	private String Marca;
	private String Tipo;
	public Producto(String nombre, String codigo, double precio, String marca, String tipo) {
		///Metodo constructor
		Nombre = nombre;
		Codigo = codigo;
		Precio = precio;
		Marca = marca;
		Tipo = tipo;
	}///Setter y getters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	

}
