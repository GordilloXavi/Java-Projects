import javax.swing.*;
public class WhileLoop {

	public static void main(String[] args) {
		
		String clave = "xavigr00";
		
		String password = "";
		
		password = JOptionPane.showInputDialog("Escribe tu contraseņa: ");
		
		if (clave.equals(password) == true) {
			
			System.out.println("Contraseņa correcta.");
			
		}
		
		while (clave.equals(password) == false){
			
			password = JOptionPane.showInputDialog("Contraseņa incorrecta. Vuelve a escribir"
					+ " tu contraseņa: ");
			if (clave.equals(password) == true) {
				
				System.out.println("Contraseņa correcta.");
			}
	}

}
}