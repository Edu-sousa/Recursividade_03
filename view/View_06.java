package view;

import java.util.Scanner;

import controller.Controller_06;

public class View_06 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller_06 cont = new Controller_06();
		int num = 0;

		while (num <= 0) {
			System.out.println("Digite um numero inteiro");
			num = sc.nextInt();
		}
		
		System.out.println("resultado da somatoria = "+cont.somaSequencia(num));
	}
}
