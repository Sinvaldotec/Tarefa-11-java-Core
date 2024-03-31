package exercicio04;

import java.util.Arrays;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 4, 5};
        System.out.println("Vetor original: " + Arrays.toString(vetor));

        inverterVetor(vetor);
        
        System.out.println("Vetor invertido: " + Arrays.toString(vetor));
    }

    public static void inverterVetor(int[] vetor) {
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
    }
}
