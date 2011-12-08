
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rommel
 */
public class ArrayUtil {

    public static int[] randomIntArray(int lungh, int max) {
        int arrayInt[] = new int[lungh];
        int intervallo;
        Random valoreInt;
        for (int i = 0; i < lungh; i++) {
            valoreInt = new Random();
            intervallo = valoreInt.nextInt(max + 1);
            arrayInt[i] = intervallo;
        }
        return arrayInt;
    }

    public static Integer[] randomIntegerArray(int lungh, int max) {
        Integer arrayInteger[] = new Integer[lungh];
        Integer intervallo;
        Random valoreInteger;
        for (int i = 0; i < lungh; i++) {
            valoreInteger = new Random();
            intervallo = valoreInteger.nextInt(max + 1);
            arrayInteger[i] = intervallo;
        }
        return arrayInteger;
    }

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

    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) {
                return false;
            }
        }

        return true;
    }
}
