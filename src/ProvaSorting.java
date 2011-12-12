
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea Romanello
 */
public class ProvaSorting {

    public static void main(String[] args) throws IOException {
        int a[] = RandomArrays.randomIntArray(20, 20);
        Integer b[] = RandomArrays.randomIntegerArray(20, 20);
        Double c[] = RandomArrays.randomDoubleArray(20, 20);
        String d[] = RandomArrays.randomStringArray(100, 5);

        //ArrayUtil.stampa(d);

        Sorting.qsort(d);
        System.out.println("elemento 0: " + d[0]);

        //System.out.println("\nstampo l'array ordinato");
        //ArrayUtil.stampa(d);

        if (Sorting.isSorted(d)) {
            System.out.println("l'array è ordinato");
        } else {
            System.out.println("l'array NON è ordinato");
        }
    }
}
