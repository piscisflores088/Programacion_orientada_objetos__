package ATM;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
	Plantilla creando_cajero= new consultar_saldo();
	
		creando_cajero.setSaldo(500);//establecido 500 pesos inicial
		creando_cajero.Operaciones();
	}
}
