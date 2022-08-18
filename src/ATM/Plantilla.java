package ATM;
import javax.swing.JOptionPane;

public abstract class Plantilla {

		protected int transacciones, deposito, retiro;//son de ámbito global, se van a utilizar en toda la clase
		private static int saldo = 0;//

		public void Operaciones() {
			int opcion = 0;
			int bandera = 0;
			do {
				do {
					opcion = Integer.parseInt(JOptionPane
							.showInputDialog("Porfavor seleccione una opcion:" + "\n" + "[1].-Consulta saldo" + "\n"
									+ "[2].-Retirar efectivo" + "\n" + "[3].-Depositar efectivo" + "\n" + "[4].-Salir"

							));
					if (opcion >= 1 && opcion <= 4) {
						bandera = 1;//es cuando se ejecuta las 4 opciones 1, 2, 3, y 4
					} else {
						JOptionPane.showMessageDialog(null, "Opcion no encontrada");
					}
				} while (bandera == 0);
				
				switch (opcion) {
				case 1: //consultar saldo
					Plantilla creando_consulta= new consultar_saldo();
					creando_consulta.Transacciones();//cuando se repite el metodo: sobreescritura de métodos

					break;
					
				case 2: //retirar
					Plantilla creando_retiro= new Retirar();
					creando_retiro.Transacciones();
					
					break;
					
				case 3://depositos
					Plantilla creando_deposito= new Depositos();
					creando_deposito.Transacciones();
					break;
					
				case 4://salir
					JOptionPane.showMessageDialog(null, "Vuelva pronto");
					bandera=2;
					break;

				}

			} while (bandera != 2);
		}

		public void Retiros() {
			retiro = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanto desea retirar?: "));
		}
		
		public void Depositos() {
			deposito = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuanto desea depositar"));
		}
		
		public abstract void Transacciones();// abstract cuando se sobreescribe, no va a retornar 

		public static int getSaldo() {
			return saldo;
		}

		public static void setSaldo(int saldo) {
			Plantilla.saldo = saldo;
		} 
		
}
