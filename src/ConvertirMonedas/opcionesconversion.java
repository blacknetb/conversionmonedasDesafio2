package ConvertirMonedas;
import javax.swing.JOptionPane;

public class opcionesconversion {
ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De colones a Dólar": 
		monedas.convertirColonesCostarrincesDolares(valor);
		break;
	
	case "De colones a pesos mexicanos": 
		monedas.convertirColonesCostarrincespesosmexicanos(valor);
		break;
		
	case "De colones a Libras Esterlinas":
		monedas.convertirColonesCostarrincesLibrasesterlina(valor);
		break;
		
	case "De colones a Yen Japonés":
		monedas.convertirColonesCostarrincesYEN(valor);
		break;
		
	case "De colones a Won sub-coreano":
		monedas.convertirColonesCostarrincesWON(valor);
		break;
	
	case "De Dólar a colones":
		monedas.convertirDolaresColonesCostarrinces(valor);
		break;
		
	case "De pesos mexicanos a colones":
		monedas.convertirPesosmexicanocolonescostarrincenses(valor);
		break;
		
	case "De Libras Esterlinas a colones":
		monedas.convertirLibracolonescostarrincenses(valor);
		break;
	 
	case "De Yen Japonés a colones":
		monedas.convertirYencolonescostarrincenses(valor);
		break;
		
	case "De Won sub-coreano a colones":
		monedas.convertirWONcolonescostarrincenses(valor);
		break;
	}
	}
}
