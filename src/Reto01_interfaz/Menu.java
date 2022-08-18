package Reto01_interfaz;
import javax.swing.JOptionPane;

import ATM.Plantilla;

public abstract class Menu {

	protected String cambiar, agregar, abandonar, desaparecer;
	private String actualizado;
	
	public void acciones() {
		int opcion = 0;
		int bandera = 0;
		
	
		do {
			do {
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor seleccione una opcion:" + "\n"+ "[1].-Guardar datos" + "\n"
									+ "[2].-Editar" + "\n" + "[3].-Eliminar" + "\n" + "[4].-Mostrar datos" +"\n"+ "[5].-Salir " 
						
						));
				if (opcion >=1 && opcion <=5 ) { 
				bandera=1;
				}else {
					JOptionPane.showMessageDialog("Opcion no encontrada");
				}
			}while (bandera==0);
			switch (opcion) {
			case 1: //guardar datos
				Menu creando_guardar= new Guardar_datos();
				creando_guardar.Cambiar();
				break;
				
			case 2: //editar
				Menu creando_editar= new Editar();
				creando_editar.Cambiar();
				break;
				
			case 3: //eliminar
				Menu creando_eliminar= new Eliminar();
				creando_eliminar.Cambiar();
				break;
				
			case 4: //mostrar datos
				Menu creando_mostrar= new Mostrar_datos();
				creando_mostrar.Cambiar();
				break;
				
			case 5: //salir
				JOptionPane.showMessageDialog(null, "Vuelva pronto");
				bandera=2;
				break;
				
				
			}
			
		}while (bandera != 2);
	}
	public void Guardar_datos() {
		cambiar = (JOptionPane.showInputDialog(null,"¿Qué datos desea guardar?: "));
	}
	
	public void Editar() {
		agregar = (JOptionPane.showInputDialog(null,"¿Qué desea editar?: "));
	}
	
	public void Eliminar() {
		desaparecer = (JOptionPane.showInputDialog(null))
	
	}
	public abstract void Transacciones();// abstract cuando se sobreescribe, no va a retornar 

	public static int getSaldo() {
		return saldo;
	}

	public static void setSaldo(int saldo) {
		Plantilla.saldo = saldo;
	} 
}
