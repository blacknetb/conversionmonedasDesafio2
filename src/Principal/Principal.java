package Principal;

import javax.swing.*;

import ConvertirMonedas.opcionesconversion;

public class Principal {
	public static void main(String[] args) {
		opcionesconversion conversion = new opcionesconversion();
		

		while (true) {
			String opciones = JOptionPane
					.showInputDialog(null, "selecione una opcion de conversion", "Menu", JOptionPane.PLAIN_MESSAGE,
							null, new Object[] { "conversor de Monedas" }, "Elegir")
					.toString();

			switch (opciones) {
			case "conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);

				int respuesta = JOptionPane.showConfirmDialog(null, "¿deseas realiizar otra conversion?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("");
				} else {
					JOptionPane.showConfirmDialog(null, "Programa finalizado");
				}
				break;

			
			}
		}
	}
}
