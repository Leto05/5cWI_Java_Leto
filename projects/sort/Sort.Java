import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 400000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("Sorting an array of size: " + size);

            // Array initialisieren
            int[] array = generateRandomArray(size, random);

            // Selection Sort
            int[] selectionArray = array.clone();
            long start = System.currentTimeMillis();
            selectionSort(selectionArray);
            long end = System.currentTimeMillis();
            System.out.println("Selection Sort: " + (end - start) + " ms");

            // Insertion Sort
            int[] insertionArray = array.clone();
            start = System.currentTimeMillis();
            insertionSort(insertionArray);
            end = System.currentTimeMillis();
            System.out.println("Insertion Sort: " + (end - start) + " ms");

            // Bubble Sort
            int[] bubbleArray = array.clone();
            start = System.currentTimeMillis();
            bubbleSort(bubbleArray);
            end = System.currentTimeMillis();
            System.out.println("Bubble Sort: " + (end - start) + " ms");

            // Quick Sort
            int[] quickArray = array.clone();
            start = System.currentTimeMillis();
            quickSort(quickArray, 0, quickArray.length - 1);
            end = System.currentTimeMillis();
            System.out.println("Quick Sort: " + (end - start) + " ms");

            System.out.println();
        }
    }

    // Generiert ein zufälliges Array der gegebenen Größe
    private static int[] generateRandomArray(int size, Random random) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000); // Zufällige Werte zwischen 0 und 100000
        }
        return array;
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
