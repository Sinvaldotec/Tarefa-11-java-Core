package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria o vetor com o tamanho especificado
        int[] vetor = new int[tamanho];

        // Preenche o vetor com os valores informados pelo usuário
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Conta a quantidade de números pares no vetor
        int quantidadePares = contarNumerosPares(vetor);

        // Exibe o resultado
        System.out.println("A quantidade de números pares no vetor é: " + quantidadePares);

        scanner.close();
    }

    // Função para contar a quantidade de números pares em um vetor
    public static int contarNumerosPares(int[] vetor) {
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
