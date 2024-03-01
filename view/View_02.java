package view;

import java.util.Scanner;

import controller.Controller_02;

public class View_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Controller_02 cont = new Controller_02();
		
		int x = 0, y = -1;
		
		while(x < 10 || x > 999999){
			System.out.println("Digite um numero de 10 a 999999");
			x = sc.nextInt();
		}
		
		while(y < 0 || y > 9){
			System.out.println("Digite um numero de 0 a 9");
			y = sc.nextInt();
		}
		
		System.out.println("Quantidade de vezes que "+y+" aparece em "+x+" : "+cont.contarSegundoNumero(x, y));
	}
}
