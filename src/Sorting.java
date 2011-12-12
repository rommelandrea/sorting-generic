
import java.io.IOException;
import java.util.Random;
import java.lang.Comparable.*;

/**
 * Esercitazione 7
 */
/**
 *
 * @author Andrea Romanello 
 * @version 0.1
 * 
 */
public class Sorting {

    public static final int SOGLIA = 50;
    private static Random generatore;

    private static void iSort(int a[], int inf, int sup) {
        for (int i = inf + 1; i <= sup; i++) {
            while (i > inf && a[i - 1] > a[i]) {
                ArrayUtil.scambia(a, i - 1, i);
                i--;
            }
        }
    }

    private static <T extends Comparable<T>> void iSort(T a[], int inf, int sup) {
        for (int i = inf + 1; i <= sup; i++) {
            while (i > inf && (a[i - 1].compareTo(a[i]) > 0)) {
                ArrayUtil.scambia(a, i - 1, i);
                i--;
            }
        }
    }

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

            if (j - inf > SOGLIA) {
                qs(a, inf, j);
            } else {
                iSort(a, inf, j);
            }

            if (sup - i > SOGLIA) {
                qs(a, i, sup);
            } else {
                iSort(a, i, sup);
            }

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

            if (j - inf > SOGLIA) {
                qs(a, inf, j);
            } else {
                iSort(a, inf, j);
            }

            if (sup - i > SOGLIA) {
                qs(a, i, sup);
            } else {
                iSort(a, i, sup);
            }

        }
    }

    public static <T extends Comparable<T>> void qsort(T[] a) {
        if (a.length > SOGLIA) {
            qs(a, 0, a.length - 1);
        } else {
            iSort(a, 0, a.length - 1);
        }

    }

    public static void qsort(int[] a) {
        if (a.length > SOGLIA) {
            qs(a, 0, a.length - 1);
        } else {
            iSort(a, 0, a.length - 1);
        }
    }

    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                return false;
            }
        }

        return true;
    }
}
