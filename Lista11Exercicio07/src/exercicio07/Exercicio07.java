package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		int[] vetor = {64, 25, 12, 22, 11};
        ordenarVetor(vetor);
        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }

    public static void ordenarVetor(int[] vetor) {
        int tamanho = vetor.length;
        
        // Percorre todo o vetor
        for (int i = 0; i < tamanho - 1; i++) {
            // Encontra o menor elemento restante
            int indiceMenor = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // Troca o menor elemento encontrado com o primeiro não ordenado
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
    }
}
