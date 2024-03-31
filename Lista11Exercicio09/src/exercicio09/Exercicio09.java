package exercicio09;

import java.util.Arrays;

public class Exercicio09 {

	public static void main(String[] args) {
		int[] vetor = {3, 5, 2, 5, 8, 5, 10}; // Vetor original
        int elemento = 5; // Elemento a ser removido
        
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        
        // Conta quantas ocorrências do elemento existem no vetor
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                contador++;
            }
        }
        
        // Cria um novo vetor com tamanho ajustado
        int[] novoVetor = new int[vetor.length - contador];
        
        // Copia os elementos do vetor original para o novo vetor, excluindo o elemento específico
        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elemento) {
                novoVetor[j++] = vetor[i];
            }
        }
        
        // Atualiza o vetor original com os elementos do novo vetor
        vetor = novoVetor;
        
        System.out.println("Vetor sem as ocorrências do elemento " + elemento + ": " + Arrays.toString(vetor));
    }
}
