package poo_Inicio;

public class CPU {
	private String Marca;
	private String Procesador;
	private String Color;
	private String Capacidad_alm;
	private int Num_procesador;
	
	public CPU(String _marca, String _procesador, String _color, String _capacidad_alm, int _num_procesador) {
		Marca = _marca;
		Procesador = _procesador;
		Color = _color;
		Capacidad_alm = _capacidad_alm;
		Num_procesador = _num_procesador;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getProcesador() {
		return Procesador;
	}
	public void setProcesador(String procesador) {
		Procesador = procesador;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getCapacidad_alm() {
		return Capacidad_alm;
	}
	public void setCapacidad_alm(String capacidad_alm) {
		Capacidad_alm = capacidad_alm;
	}
	public int getNum_procesador() {
		return Num_procesador;
	}
	public void setNum_procesador(int num_procesador) {
		Num_procesador = num_procesador;
	}
	
	
	
	
}
