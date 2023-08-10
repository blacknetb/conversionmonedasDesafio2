package ConvertirMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void convertirColonesCostarrincesDolares(double valor) {
		double monedaDolar = valor / 0.19;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaDolar + "DOLARES");
	}

	public void convertirColonesCostarrincespesosmexicanos(double valor) {
		double monedapesos = valor / 0.32;
		monedapesos = (double) Math.round(monedapesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedapesos + "pesos Mexicanos");
	}

	public void convertirColonesCostarrincesLibrasesterlina(double valor) {
		double monedaLibra = valor /0.0015;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaLibra + "Libras esterlina");
	}

	public void convertirColonesCostarrincesYEN(double valor) {
		double monedaYEN = valor / 0.27;
		monedaYEN = (double) Math.round(monedaYEN * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaYEN + "Yen Japones");
	}

	public void convertirColonesCostarrincesWON(double valor) {
		double monedaWON = valor / 2.45;
		monedaWON = (double) Math.round(monedaWON * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaWON + "WON sub-coreano");
	}
	public void convertirDolaresColonesCostarrinces(double valor) {
		double monedaDolar =  1 / valor;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene $ " + monedaDolar + "colon");
	}
	public void convertirPesosmexicanocolonescostarrincenses(double valor) {
		double monedapesos = 1 * valor;
		monedapesos = (double) Math.round(monedapesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene Peso mexicano " + monedapesos + "Colon");
	}

	public void convertirLibracolonescostarrincenses(double valor) {
		double monedalibra = 1 * valor;
		monedalibra = (double) Math.round(monedalibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene Libra " + monedalibra + "Colon");
	}

	public void convertirYencolonescostarrincenses(double valor) {
		double monedaYEN = 1 * valor;
		monedaYEN = (double) Math.round(monedaYEN * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene Yen Japones " + monedaYEN + "Colon");
	}

	public void convertirWONcolonescostarrincenses(double valor) {
		double monedaWON = 1 * valor;
		monedaWON = (double) Math.round(monedaWON * 100d) / 100;
		JOptionPane.showMessageDialog(null, "tiene WON sub-coreano " + monedaWON + "Colon");
	}

}