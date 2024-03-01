package controller;

public class Controller_06 {

	public Controller_06() {
		super();
	}

	public double somaSequencia(int num) {

		// condição de parada: quando o num for igual a 0
		if (num == 0) {
			return 0;
		} else {
			double r = 1 / (double) fatorial(num);
			//a cada volta r é retornado, enquanto a função é chamada com o num -1 como parâmetro
			return r + somaSequencia(num - 1);
		}
	}

	public int fatorial(int numero) {

		// condição de parada: quando o numero passado for igual a 0
		if (numero == 0) {
			return 1;
		} else {
			// a cada volta o numero passado é multiplicado, enquanto a função é retornada
			// com o numero - 1
			return numero * fatorial(numero - 1);
		}
	}
}
