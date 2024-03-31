package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Tamanho do vetor
	        System.out.print("Informe o tamanho do vetor: ");
	        int tamanho = scanner.nextInt();

	        // Criação do vetor
	        int[] vetor = new int[tamanho];

	        // Preenchimento do vetor
	        System.out.println("Informe os elementos do vetor:");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        // Elemento a ser verificado
	        System.out.print("Informe o elemento a ser verificado: ");
	        int elemento = scanner.nextInt();

	        // Verificação se o elemento está presente no vetor
	        boolean encontrado = false;
	        for (int i = 0; i < tamanho; i++) {
	            if (vetor[i] == elemento) {
	                encontrado = true;
	                break;
	            }
	        }

	        if (encontrado) {
	            System.out.println("O elemento " + elemento + " está presente no vetor.");
	        } else {
	            System.out.println("O elemento " + elemento + " não está presente no vetor.");
	        }

	        scanner.close();
	    }
	}
