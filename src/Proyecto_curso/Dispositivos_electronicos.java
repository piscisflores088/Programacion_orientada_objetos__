package Proyecto_curso;

public class Dispositivos_electronicos {

	public String Nombre;
	public String Marca;
	public String Color;
	public String Tipo_pantalla;
	public String Nombre_modelo;
	
	public Dispositivos_electronicos(String nombre, String marca, String color, String tipo_pantalla,
			String nombre_modelo) {
		super();
		Nombre = nombre;
		Marca = marca;
		Color = color;
		Tipo_pantalla = tipo_pantalla;
		Nombre_modelo = nombre_modelo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTipo_pantalla() {
		return Tipo_pantalla;
	}

	public void setTipo_pantalla(String tipo_pantalla) {
		Tipo_pantalla = tipo_pantalla;
	}

	public String getNombre_modelo() {
		return Nombre_modelo;
	}

	public void setNombre_modelo(String nombre_modelo) {
		Nombre_modelo = nombre_modelo;
	}
	
	
	
}
