package controller;

public class Controller_05 {

	public Controller_05() {
		super();
	}

	public int fibonacci(int n) {
		// condição de parada: quando n for igual a 0
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			// o retorno é a função fibonacci -1, mais a função fibonacci -2
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
