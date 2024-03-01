package view;

import java.util.Scanner;

import controller.Controller_03;

public class View_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Controller_03 cont = new Controller_03();
		
		System.out.println("Insira uma palavra");
		String entrada = sc.next();
		int tamanho = entrada.length();
		
		System.out.println(cont.reversao(entrada, tamanho));	
	}
}
