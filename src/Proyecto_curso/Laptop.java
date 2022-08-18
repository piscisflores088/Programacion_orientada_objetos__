package Proyecto_curso;

public class Laptop extends Dispositivos_electronicos {

	private String Tipo_teclado;
	private String Tipo_mouse;
	private String Tipo_procesador;
	private String Almacenamiento;
	private String Tipo_SO;
	
	public Laptop(String nombre, String marca, String color, String tipo_pantalla, String nombre_modelo,
			String tipo_teclado, String tipo_mouse, String tipo_procesador, String almacenamiento, String tipo_SO) {
		super(nombre, marca, color, tipo_pantalla, nombre_modelo);
		Tipo_teclado = tipo_teclado;
		Tipo_mouse = tipo_mouse;
		Tipo_procesador = tipo_procesador;
		Almacenamiento = almacenamiento;
		Tipo_SO = tipo_SO;
	}
	public String getTipo_teclado() {
		return Tipo_teclado;
	}
	public void setTipo_teclado(String tipo_teclado) {
		Tipo_teclado = tipo_teclado;
	}
	public String getTipo_mouse() {
		return Tipo_mouse;
	}
	public void setTipo_mouse(String tipo_mouse) {
		Tipo_mouse = tipo_mouse;
	}
	public String getTipo_procesador() {
		return Tipo_procesador;
	}
	public void setTipo_procesador(String tipo_procesador) {
		Tipo_procesador = tipo_procesador;
	}
	public String getAlmacenamiento() {
		return Almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		Almacenamiento = almacenamiento;
	}
	public String getTipo_SO() {
		return Tipo_SO;
	}
	public void setTipo_SO(String tipo_SO) {
		Tipo_SO = tipo_SO;
	}
	
	
	
	
}
