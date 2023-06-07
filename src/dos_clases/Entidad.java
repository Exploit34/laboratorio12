package dos_clases;

import javax.swing.JOptionPane;

public class Entidad {
	 private double ladoA;
	private double ladoB;
	
	public void ingresarDatos() {
		// Método para ingresar los lados del rectángulo.
		
		String cadena;
		 //Se muestra una ventana emergente para ingresar la longitud del lado A y se convierte a tipo double.
		 cadena =JOptionPane.showInputDialog(null, "ingrese la longitud del lado A:");
		 ladoA= Double.parseDouble(cadena);
		 
		 //Se muestra una ventana emergente para ingresar la longitud del lado B y se convierte a tipo double.
		 cadena =JOptionPane.showInputDialog(null, "ingrese la longitud del lado B:");
		 ladoB= Double.parseDouble(cadena);
	}
	
	public void calcularArea() {
		// Método para calcular el área del rectángulo.
			double resultado;
			resultado = ladoA * ladoB;
				
			JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
			// Muestra una ventana emergente con el resultado del cálculo del área del rectángulo.
	}

}
