
import java.util.Random;
import java.lang.Comparable.*;

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

    private static <T extends Comparable<T>> void qs(T a[], int inf, int sup) {
        int i, j;
        i = inf;
        j = sup;
        if (inf < sup) {
            generatore = new Random();
            int intervallo = generatore.nextInt(sup - inf + 1);    // mi trova un valore compreso tra inf e sup
            T pivot = a[intervallo + inf];
            do {
                while (a[i].compareTo(pivot) < 0) {
                    i++;
                }
                while (a[j].compareTo(pivot) > 0) {
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

    public static <T extends Comparable<T>> void qsort(T[] a) {
        qs(a, 0, a.length - 1);
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

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        qsort(b);


        System.out.println("\nstampo l'array ordinato");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
