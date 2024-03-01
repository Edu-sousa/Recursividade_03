package controller;

public class Controller_01 {

	public Controller_01() {
		super();
	}

	public int qtdDigitos(int x) {

		// condição de parada: quando x for menor que 10, retornando 1
		if (x < 10) {
			return 1;
		} else {
			// a cada volta 1 é adicionado ao retorno, enquanto a função é chamado passando
			// x com um digito a menos como parâmetro
			return 1 + qtdDigitos(x / 10);
		}
	}

}
