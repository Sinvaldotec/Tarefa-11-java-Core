package exercicio06;

import java.util.HashMap;

public class Exercicio06 {

	public static void main(String[] args) {
		 int[] vetor = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};

	        // Crie um HashMap para armazenar a frequência de cada elemento
	        HashMap<Integer, Integer> frequencia = new HashMap<>();

	        // Itera sobre o vetor para contar a frequência de cada elemento
	        for (int elemento : vetor) {
	            if (frequencia.containsKey(elemento)) {
	                // Se o elemento já estiver no mapa, incrementa sua frequência
	                frequencia.put(elemento, frequencia.get(elemento) + 1);
	            } else {
	                // Se o elemento não estiver no mapa, adiciona com frequência 1
	                frequencia.put(elemento, 1);
	            }
	        }

	        // Exibe a frequência de cada elemento único
	        System.out.println("Frequência de cada elemento único:");
	        for (int elemento : frequencia.keySet()) {
	            int frequenciaElemento = frequencia.get(elemento);
	            System.out.println("Elemento " + elemento + ": " + frequenciaElemento + " vezes");
	        }
	    }
	}