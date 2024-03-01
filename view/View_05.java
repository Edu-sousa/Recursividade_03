package view;

import java.util.Scanner;

import controller.Controller_05;

public class View_05 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Controller_05 cont = new Controller_05();
		int n = 0;
		
		while(n <=0 || n > 20) {
			System.out.println("Digite um numero de 1 a 20");
			n = sc.nextInt();
		}
		
		System.out.println("A "+ n + "° posição da série de fibonacci é : "+ cont.fibonacci(n));
	}
}

