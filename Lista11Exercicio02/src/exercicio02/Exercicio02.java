package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        // Preencher o vetor com valores digitados pelo usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para o elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Encontrar o maior e o menor valor no vetor
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor no vetor é: " + maior);
        System.out.println("O menor valor no vetor é: " + menor);

        scanner.close();
    }
}