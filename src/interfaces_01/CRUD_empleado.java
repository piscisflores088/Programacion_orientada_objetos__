package interfaces_01;
/**
 * Interfaz metodos empleado
 * @author ALUMNO
 *
 */
public interface CRUD_empleado {
	
	/**
	 * Lista metodos
	 * 
	 * @param id
	 * @param nombre
	 * @return
	 */
	public String insertarEmpleado(int id, String nombre);
	
	public String actualizarEmpleado(String nombre);
	
	public String borrarEmpleado(int id);
	
	public String consultarEmpleado(int id, String nombre);
	
	
}
