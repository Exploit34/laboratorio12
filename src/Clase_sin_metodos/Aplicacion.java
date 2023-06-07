package Clase_sin_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {
	
	 public static void main(String args[]) {
		 
		// Declaración de variables para almacenar los valores ingresados y el resultado del cálculo.
		 String cadena;
		 double ladoA;
		 double ladoB;
		 double resultado;
		 
		 //Se muestra una ventana emergente para ingresar la longitud del lado A y se convierte a tipo double.
		 cadena =JOptionPane.showInputDialog(null, "ingrese la longitud del lado A:");
		 ladoA= Double.parseDouble(cadena);
		 
		 //Se muestra una ventana emergente para ingresar la longitud del lado B y se convierte a tipo double.
		 cadena =JOptionPane.showInputDialog(null, "ingrese la longitud del lado B:");
		 ladoB= Double.parseDouble(cadena);
		 
		// Cálculo del área del rectángulo multiplicando los lados A y B.
		 resultado = ladoA * ladoB;
		 
		 JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado);
		// Se muestra una ventana emergente con el resultado del cálculo del área del rectángulo.
		 
	 }
	

}
