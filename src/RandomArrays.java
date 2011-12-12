
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
 * Esercitazione 7
 * funzioni per la creazione di array casuali
 */
/**
 *
 * @author Andrea Romanello
 * @version 0.1
 */
public class RandomArrays {

    /**
     * questa funzione crea un array di interi di lunghezza lungh e
     * valori compresi tra 0 e max
     * @param lungh
     * @param max
     * @return array di interi
     */
    public static int[] randomIntArray(int lungh, int max) {
        int array[] = new int[lungh];

        Random rnd = new Random();

        for (int i = 0; i < lungh; i++) {
            array[i] = rnd.nextInt(max + 1);
        }

        return array;
    }

    /**
     * crea un array di lunghezza lungh, valori compresi tra 0 e max
     * di oggetti di tipo integer
     * @param lungh
     * @param max
     * @return array di tipo integer
     */
    public static Integer[] randomIntegerArray(int lungh, int max) {
        Integer array[] = new Integer[lungh];

        Random rnd = new Random();

        for (int i = 0; i < lungh; i++) {
            array[i] = rnd.nextInt(max + 1);
        }

        return array;
    }

    /**
     * crea un array di lunghezza lungh, valori compresi tra 0 e max
     * di oggetti di tipo double
     * @param lungh
     * @param max
     * @return 
     */
    public static Double[] randomDoubleArray(int lungh, int max) {
        Double array[] = new Double[lungh];

        Random rnd = new Random();

        for (int i = 0; i < lungh; i++) {
            array[i] = rnd.nextDouble() * (double) max;
        }

        return array;
    }

    /**
     * crea un array di oggetti di tipo string e lunghezza lungh
     * @param lungh lunghezza dell'array
     * @param lunghString lunghezza delle stringhe
     * @return array di stringhe
     * @throws IOException 
     */
    public static String[] randomStringArray(int lungh, int lunghString) 
            throws IOException {
        
        String[] prova = readStringArrayFromFile();
        int n = prova.length;
        String arrayString[] = new String[lungh];
        int indice;
        Random rnd = new Random();
        int i = 0;

        while (i < lungh) {
            indice = rnd.nextInt(n);
            if (prova[indice].length() == lunghString) {
                arrayString[i] = prova[indice];
                i++;
            }
        }
        return arrayString;
    }

    /**
     * metodo ausiliario al metodo randomStringArray
     * legge il file stringhe.txt, crea un array di stringhe che verrà poi utilizzato
     * dall'altro metodo per generare l'array
     * @return string array
     * @throws IOException 
     */
    private static String[] readStringArrayFromFile() throws IOException {
        String nomeFile = "stringhe.txt";
        File file = new File(nomeFile);
        Scanner input = new Scanner(file);
        int n = 0;

        while (input.hasNextLine()) {
            input.nextLine();
            n++;
        }

        String[] nuovoArray = new String[n];
        input.close();
        input = new Scanner(file);

        for (int i = 0; i < n; i++) {
            nuovoArray[i] = input.nextLine();
        }
        return nuovoArray;
    }
}
