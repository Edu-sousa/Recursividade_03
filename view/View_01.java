package view;

import java.util.Scanner;

import controller.Controller_01;

public class View_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_01 cont = new Controller_01();

		System.out.println("Digite um numero");
		int x = sc.nextInt();

		if (x < 0)
			x = Math.abs(x);

		System.out.println("A quantidade de digitos nesse numero é = " + cont.qtdDigitos(x));
	}
}
