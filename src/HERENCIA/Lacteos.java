package HERENCIA;
import java.util.ArrayList;

public class Lacteos extends Producto {

	private String Fecha_caducidad;
	private double Descuento;
	public Lacteos(String nombre, String codigo, double precio, String marca, String tipo, String fecha_caducidad,
			double descuento) {
		super(nombre, codigo, precio, marca, tipo);
		Fecha_caducidad = fecha_caducidad;
		Descuento = descuento;
	}
	public String getFecha_caducidad() {
		return Fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		Fecha_caducidad = fecha_caducidad;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		Descuento= descuento;
	
	}
	public double calcular_precio(double precio,double descuento) {
		precio=getPrecio();
		descuento=getDescuento();
		return precio-descuento;
	}
	
	public String Lista_lacteos(String nombre, double descuento) {
		double descontar=0.1;
		
		nombre=getNombre();
		descuento=getDescuento();
		if(descuento==descontar) {
			ArrayList<String>lista1= new ArrayList<String>();
			lista1.add(nombre);
			lista1.add(nombre)
			
		}
	}
}
