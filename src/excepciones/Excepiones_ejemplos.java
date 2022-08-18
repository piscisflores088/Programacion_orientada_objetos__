package excepciones;

public class Excepiones_ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mensaje=null;
		try {
		mensaje.equals("Hola");

		}catch(Exception ex) {
			System.out.println("Error" + ex.getMessage());
		}
	}

}
