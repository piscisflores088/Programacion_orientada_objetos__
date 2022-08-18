package interfaces_01;
/**
 * Clase principal
 * @version 1.0
 * @author ALUMNO
 * 
 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Construyendo los objetos
		 * @see interfaz CRUD_Empleado y clase implementar_crud_empleado
		 */
		CRUD_empleado operaciones = new implementar_crud_empleado();
		
		operaciones.insertarEmpleado(1, "Victor");
		
		operaciones.actualizarEmpleado("Victor");
		operaciones.borrarEmpleado(1);
		operaciones.consultarEmpleado(1, "Victor");

	}

}
