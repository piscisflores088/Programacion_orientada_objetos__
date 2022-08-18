package Practicas_extras;

import javax.swing.JOptionPane;

public class Pract_swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog("Anota tu nombre");
		String apellido = JOptionPane.showInputDialog("Anota tu apellido");
		
		JOptionPane.showMessageDialog(null, "Tu nombre es ["+(nombre + apellido)+"]:" );

	
		
	}

}
