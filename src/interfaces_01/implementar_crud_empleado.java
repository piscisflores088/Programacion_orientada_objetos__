package interfaces_01;

public class implementar_crud_empleado implements CRUD_empleado{
	/**
	 * Metodo para insertar datos empleado
	 * @see CRUD_empleado
	 */

	@Override
	public String insertarEmpleado(int id, String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Datos guardados" + "\nCon id: "+id+"\nNombre:" +nombre);
		return null;
	}

	@Override
	public String actualizarEmpleado(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Datos del empleado " +nombre+ " actualizados correctamente");
		return null;
	}

	@Override
	public String borrarEmpleado(int id) {
		// TODO Auto-generated method stub
		System.out.println("Empleado con id: "+id +" eliminados");
		return null;
	}

	@Override
	public String consultarEmpleado(int id, String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Datos del empleado: " +
				           "\nid empleado: "+ id
				           +"\nNombre empleado: "+ nombre);
		return null;
	}
	
	

}
