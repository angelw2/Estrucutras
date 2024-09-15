
package pigeonhole.__sort;

/**
 *
 * @author Adriam Angel
 */
public class PigeonholeSort {
    // Método que realiza el algoritmo Pigeonhole Sort
    public static void sort(int[] arr) {
        // Encontrar el valor mínimo y máximo en el arreglo
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], min)) {
                min = arr[i];
            } else if (less(max, arr[i])) {
                max = arr[i];
            }
        }

        // Crear la matriz de pigeonholes (ranuras)
        int range = max - min + 1;
        int[] holes = new int[range];

        // Llenar los pigeonholes
        for (int i = 0; i < arr.length; i++) {
            holes[arr[i] - min]++;
        }

        // Reconstruir el array original a partir de los pigeonholes
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (holes[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    // Método auxiliar para comparar dos elementos
    private static boolean less(int a, int b) {
        return a < b;
    }

    // Método para mostrar el estado actual del arreglo
    public static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

