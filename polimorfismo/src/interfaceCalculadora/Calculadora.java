package interfaceCalculadora;

public class Calculadora implements Padrao, Cientifica {

	@Override
	public int soma(int a, int b) {
		return a + b;
	}

	@Override
	public int subtracao(int a, int b) {
		return a - b;
	}

	@Override
	public double potencia(int a, int b) {
		return Math.pow(a, b);
	}

}
