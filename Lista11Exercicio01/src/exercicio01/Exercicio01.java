package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		// Definindo um vetor de inteiros
        int[] vetor = {5, 10, 15, 20, 25};

        // Chamando o método para calcular a soma dos elementos do vetor
        int soma = calcularSoma(vetor);

        // Exibindo o resultado
        System.out.println("A soma dos elementos de um vetor de inteiros é: " + soma);
    }

    // Método para calcular a soma dos elementos do vetor
    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}
