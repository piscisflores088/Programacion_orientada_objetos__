package Proyecto_curso;

public class Celular extends Dispositivos_electronicos {

	private String Tipo_camara;
	private int Pixeles;
	private int IMEI;
	private String Numero_modelo;
	
	
	public Celular(String nombre, String marca, String color, String tipo_pantalla, String nombre_modelo,
			String tipo_camara, int pixeles, int iMEI, String numero_modelo) {
		super(nombre, marca, color, tipo_pantalla, nombre_modelo);
		Tipo_camara = tipo_camara;
		Pixeles = pixeles;
		IMEI = iMEI;
		Numero_modelo = numero_modelo;
	}
	public String getTipo_camara() {
		return Tipo_camara;
	}
	public void setTipo_camara(String tipo_camara) {
		Tipo_camara = tipo_camara;
	}
	public int getPixeles() {
		return Pixeles;
	}
	public void setPixeles(int pixeles) {
		Pixeles = pixeles;
	}
	public int getIMEI() {
		return IMEI;
	}
	public void setIMEI(int iMEI) {
		IMEI = iMEI;
	}
	public String getNumero_modelo() {
		return Numero_modelo;
	}
	public void setNumero_modelo(String numero_modelo) {
		Numero_modelo = numero_modelo;
	}
	
	
	
}
