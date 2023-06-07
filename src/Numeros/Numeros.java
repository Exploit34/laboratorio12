package Numeros;

import javax.swing.JOptionPane;

public class Numeros {
	
	int number;
	int i, neg=0, par=0;
	
	public void entrada() {
		// Método para ingresar números y contar los números pares y negativos.
		for(i=0; i< 5; i++){
			number =ingresarDatos("digite 1 numero");
			if(number %2==0) {
				par++;
				
			}
			if(number <0) {
				neg++;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "El numero de numeros pares es: "+par+ "\n"
				+ " y el numero de numeros negativos es "+ neg);
		// Muestra una ventana emergente con el conteo de números pares y negativos.
	}
	
	public static int ingresarDatos(String mensaje) {
		 // Método para ingresar datos desde una ventana emergente.
		String cadena;
		int valor;
		cadena= JOptionPane.showInputDialog(null, mensaje);
		valor = Integer.parseInt(cadena);
		
		return valor;
		// Retorna el valor ingresado convertido a tipo int.
	}

}
