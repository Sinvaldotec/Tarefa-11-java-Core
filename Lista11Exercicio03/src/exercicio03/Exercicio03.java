package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Criar o vetor com o tamanho especificado
        double[] vetor = new double[tamanho];

        // Pedir ao usuário para inserir os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }

        // Calcular a média dos elementos do vetor
        double soma = 0;
        for (double elemento : vetor) {
            soma += elemento;
        }
        double media = soma / tamanho;

        // Exibir a média
        System.out.println("A média dos elementos do vetor é: " + media);

        scanner.close();
    }
}