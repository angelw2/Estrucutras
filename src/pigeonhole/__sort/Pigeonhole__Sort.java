
package pigeonhole.__sort;

/**
 *
 * @author Adriam Angel
 */
public class Pigeonhole__Sort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 7, 4, 6, 8};
        
        System.out.println("Array original:");
        PigeonholeSort.show(arr);  // Llamada al método show() desde PigeonholeSort
        
        PigeonholeSort.sort(arr);  // Llamada al método sort() desde PigeonholeSort
        
        System.out.println("Array ordenado:");
        PigeonholeSort.show(arr);  // Llamada al método show() desde PigeonholeSort
    }
}
