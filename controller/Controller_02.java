package controller;

public class Controller_02 {

	public Controller_02() {
		super();
	}

	public int contarSegundoNumero(int x, int y) {
		// condição de parada: quando o numero for igual a 0
		if (x == 0) {
			return 0;
		} else {
			// se o resto da divisão for igual a y, adiciona 1 ao retorno da função
			// a função sempre é chamada com x dividindo por 10, para diminuir um digito
			if (x % 10 == y)
				return 1 + contarSegundoNumero(x / 10, y);
			else
				return contarSegundoNumero(x / 10, y);
		}
	}
}
