package controller;

public class ThreadController extends Thread {
	private int codigo;
	private int tempCelsius;
	private int indiceVet;
	private double novaTemp = 0.0;

	public ThreadController(int c, int tc, int iv) {
		this.codigo = c;
		this.tempCelsius = tc;
		this.indiceVet = iv;
	}

	@Override
	public void run() {
		calculaTemp();
	}

	private void calculaTemp() {
		String tipo;
		switch (codigo) {
		// kelvin
		case 1:
			tipo = "kelvin";
			novaTemp = tempCelsius + 273;
			break;
		// fahrenheit
		case 2:
			tipo = "fahrenheit";
			novaTemp = 1.8 * tempCelsius + 32;
			break;
		default:
			tipo = "celsius";
			novaTemp = tempCelsius;
			break;
		}
		System.out.println("INDICE "+indiceVet+"\nTEMP ORIGINAL "+tempCelsius+" CELSIUS\nTEMP NOVA "+novaTemp+" "+tipo+"\n");
	}
}
