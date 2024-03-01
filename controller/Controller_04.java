package controller;

public class Controller_04 {

	public Controller_04() {
		super();
	}

	public String binario(int x) {
		// condição de parada: quando o x for igual a 0
		if (x == 0) {
			return "";
		} else {
			int resto = x % 2;
			String s = String.valueOf(resto);
			// a cada volta s é retornardo (s sendo uma String com o resto da divisão),
			// enquanto a função é retornada com x/2 como parâmetro
			return s + binario(x / 2);
		}
	}
}
