package controller;

public class Controller_03 {

	public Controller_03() {
		super();
	}

	public String reversao(String entrada, int tamanho) {
		// condição de parada: quando o tamanho da palavra for igual 0
		if (tamanho == 0) {
			return "";
		} else {
			// a cada volta a ultima letra sera retornada através da função substring,
			// enquanto a função é retornada com seu tamanho - 1
			return entrada.substring(tamanho - 1, tamanho) + reversao(entrada, --tamanho);
		}
	}
}
