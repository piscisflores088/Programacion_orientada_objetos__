package practica_poo;

public class Ropas {
	private String Sexo;
	private String Tipo;
	private String Color;
	private int talla;
	private int precio;
	
	public Ropas(String sexo, String tipo, String color, int talla, int precio) {
		Sexo = sexo;
		Tipo = tipo;
		Color = color;
		this.talla = talla;
		this.precio = precio;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
