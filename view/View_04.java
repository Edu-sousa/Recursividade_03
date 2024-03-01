package view;

import java.util.Scanner;

import controller.Controller_04;

public class View_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller_04 cont = new Controller_04();
		int x = 0;
		
		while(x <= 0 || x > 2000) {
			System.out.println("Digite um numero entre 1 e 2000");
			x = sc.nextInt();
		}
		
		String converter = cont.binario(x);
		String binario = new StringBuilder(converter).reverse().toString();
		
		System.out.println(x +" em binário : "+ binario);
	}
}
