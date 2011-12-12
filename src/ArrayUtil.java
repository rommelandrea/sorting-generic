
import java.util.Random;

/*
 * Esercitazione 7
 * funzioni varie di appoggio per array
 */
/**
 *
 * @author Andrea Romanello
 */
public class ArrayUtil {

    public static void scambia(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T extends Comparable<T>> void scambia(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void stampa(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " -> ");
        }
        System.out.println("");
    }

    public static <T extends Comparable<T>> void stampa(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " -> ");
        }
        System.out.println("");
    }
}
