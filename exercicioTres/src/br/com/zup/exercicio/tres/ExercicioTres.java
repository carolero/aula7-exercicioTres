package br.com.zup.exercicio.tres;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		// Inicializando o scanner
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual será o primeiro número da lista?");
		int numeroInicial = scan.nextInt();
		
		System.out.println("E qual será o último número?");
		int numeroFinal = scan.nextInt();
		
		String lista = "";
		
		if (numeroFinal < numeroInicial) {
			System.out.println("Seu número final é maior que o inicial, o programa não pode ser inicializado.");
		} else {
			for (int i = numeroInicial; i <= numeroFinal; i++) {
				if (i < numeroFinal) {
					lista += i + ", ";
				} else {
					lista += i;
				}
			}
		}
		
		System.out.print(lista);
		
		
	}

}
