
import java.util.Random;

/*
 * Esercitazione 7
 */

/**
 *
 * @author Andrea Romanello 
 * @version 0.1
 * 
 */
public class Sorting {

    public final int SOGLIA = 50;
    private static Random generatore;

    public static <T extends Comparable<T>> void qs(T[] a, int inf, int sup) {
        if (inf < sup) {
            generatore = new Random();
            int intervallo = generatore.nextInt(sup - inf + 1);    // mi trova un valore compreso tra inf e sup
            T pivot;
            pivot = a[intervallo + inf];

            int i, j;
            i = inf;
            j = sup;

            while (i <= j) {
                while (a[i].compareTo(pivot) <= 0 && i <= j) {
                    i++;
                }
                while (a[j].compareTo(pivot) >= 0 && i <= j) {
                    j--;
                }
                if (i <= j) {
                    ArrayUtil.scambia(a, i, j);
                    i++;
                    j--;
                }
            }
            qs(a, inf, i - 1);
            qs(a, j + 1, sup);
        }
    }

    public static void qs(int[] a, int inf, int sup) {
        int i, j;
        i = inf;
        j = sup;
        if (inf < sup) {
            generatore = new Random();
            int intervallo = generatore.nextInt(sup - inf + 1);    // mi trova un valore compreso tra inf e sup
            int pivot = a[intervallo + inf];
            do {
                while (a[i] < pivot) {
                    i++;
                }
                while (a[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    ArrayUtil.scambia(a, i, j);
                    i++;
                    j--;
                }
            } while (i <= j);

            qs(a, inf, j);

            qs(a, i, sup);

        }
    }

    public static void qsort(int[] a) {
        qs(a, 0, a.length - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = ArrayUtil.randomIntArray(20, 20);
        Integer b[] = ArrayUtil.randomIntegerArray(20, 20);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        qsort(a);


        System.out.println("\nstampo l'array ordinato");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
