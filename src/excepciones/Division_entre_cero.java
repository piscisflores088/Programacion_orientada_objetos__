package excepciones;

public class Division_entre_cero {
	
	public static int numerador = 52;
	public static int denominador = 0;
	public static float division;

	public static void main(String[] args) {
		System.out.println("ANTES DE HACER LA DIVISION ");
		try {
			division=numerador/denominador;
			
		}catch(Exception ex) {
		division=0;
		System.out.println("Error: " +ex.getMessage());
		}finally {
			System.out.println("División: "+division);
			System.out.println("Despues de hacer la división ");
		}
	}
		
		
		
		
		
		
	


	}


