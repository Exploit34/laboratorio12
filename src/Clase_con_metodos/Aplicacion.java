package Clase_con_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ladoA;
		double ladoB;
		
		ladoA=ingresarDatos("ingrese la  longuitud del lado A: ");
		ladoB=ingresarDatos("ingrese la  longuitud del lado B: ");
		 
		calcularArea( ladoA, ladoB);
	    // Llama al método calcularArea() pasando los lados A y B como argumentos.

	}
	
	public static double ingresarDatos(String mensaje) {
		// Método para ingresar los datos desde una ventana emergente.
		String cadena; 
		double valor;
		
		cadena =JOptionPane.showInputDialog(null, mensaje);
		valor =Double.parseDouble(cadena);
		
		return valor;
		// Retorna el valor ingresado convertido a tipo double.
		
	}
	public static void calcularArea( double a, double b) {
		// Método para calcular el área del rectángulo.
		double resultado;
		resultado = a * b;
		
		JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
		// Muestra una ventana emergente con el resultado del cálculo del área del rectángulo.
	}

}
