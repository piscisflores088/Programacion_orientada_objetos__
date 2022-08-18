package Proyecto_curso;

public class Television extends Dispositivos_electronicos{
	
	private String Acceso_datos;
	private String Numero_serie;
	private String Pulgadas;
	private String Colocacion;
	
	public Television(String nombre, String marca, String color, String tipo_pantalla, String nombre_modelo,
			String acceso_datos, String numero_serie, String pulgadas, String colocacion) {
		super(nombre, marca, color, tipo_pantalla, nombre_modelo);
		Acceso_datos = acceso_datos;
		Numero_serie = numero_serie;
		Pulgadas = pulgadas;
		Colocacion = colocacion;
	}

	public String getAcceso_datos() {
		return Acceso_datos;
	}

	public void setAcceso_datos(String acceso_datos) {
		Acceso_datos = acceso_datos;
	}

	public String getNumero_serie() {
		return Numero_serie;
	}

	public void setNumero_serie(String numero_serie) {
		Numero_serie = numero_serie;
	}

	public String getPulgadas() {
		return Pulgadas;
	}

	public void setPulgadas(String pulgadas) {
		Pulgadas = pulgadas;
	}

	public String getColocacion() {
		return Colocacion;
	}

	public void setColocacion(String colocacion) {
		Colocacion = colocacion;
	}
	
}
	