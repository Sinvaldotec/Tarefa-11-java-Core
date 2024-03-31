package exercicio10;

import java.util.Arrays;

public class Exercicio10 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < length1) {
            mergedArray[k++] = array1[i++];
        }

        while (j < length2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
