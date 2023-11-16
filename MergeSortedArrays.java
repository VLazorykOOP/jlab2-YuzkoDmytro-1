import java.util.Arrays;
import java.util.Random;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Створюєм і сортуєм перший масив
        int[] array1 = generateRandomArray(5);
        bubbleSort(array1);

        // Створюєм і сотруєм другий масив
        int[] array2 = generateRandomArray(5);
        bubbleSort(array2);

        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));

        // Злиття двох масивів
        int[] mergedArray = mergeArrays(array1, array2);
        System.out.println("Злитий масив: " + Arrays.toString(mergedArray));
    }

    // Генерація випадкового масиву
    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Генерувати випадкові числа в межах від 0 до 99
        }
        return array;
    }

    // Сортування методом бульбашки
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмін елементів, якщо вони в неправильному порядку
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Злиття двох впорядкованих масивів
    private static int[] mergeArrays(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < size1) {
            mergedArray[k++] = array1[i++];
        }

        while (j < size2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
