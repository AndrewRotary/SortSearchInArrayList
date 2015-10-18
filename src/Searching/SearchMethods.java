package Searching;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static CreateArrayL.Arrays.createRandom;
import static InAndOut.ReadMax.ArrayMaxLength;
import static SearchingKey.KeySearch.*;

/**
 * Created by Root-World on 17.10.2015.
 */
public class SearchMethods {
    public static void SequentialClasicMethod() throws IOException{
        //Seqvential clasic search
        long SequentialTime = 0;
        int SequentialContor = 0;
        int ArrayLength = ArrayMaxLength();
        ArrayList<Integer> SequentialClasic = new ArrayList<Integer>();
        createRandom(ArrayLength, SequentialClasic);
        System.out.println("\nCase Medium\n"+SequentialClasic);
        int key = KeySearch(SequentialClasic, SequentialTime, SequentialContor);
        /* System.out.println("\nInterchanges: " + SecventialContor + "\nTime: " + SecventialTime); */
        //Favorable case
        Collections.sort(SequentialClasic);
        System.out.println("\nCase Favorabel\n" + SequentialClasic);
        KeySearchEntered(SequentialClasic, SequentialTime, SequentialContor, key);
        //Unfovorable
        Collections.reverse(SequentialClasic);
        System.out.println("\nCase Unfavorable\n" + SequentialClasic);
        KeySearchEntered(SequentialClasic, SequentialTime, SequentialContor, key);
    }

    public static void SequentialOrderedMethod() throws IOException{
        //SequentialOrdered
        long SequentialTime = 0;
        int SequentialContor = 0;
        System.out.println("\n Sequential ORDERED Search");
        int ArrayLength = ArrayMaxLength();
        ArrayList<Integer> SequentialOrdered = new ArrayList<Integer>();
        createRandom(ArrayLength, SequentialOrdered);
        Collections.sort(SequentialOrdered);
        System.out.println("\nCase Medium\n" + SequentialOrdered);
        KeySearchOrdered(SequentialOrdered, SequentialTime, SequentialContor);

        System.out.println("\nCase Favorable\n" + SequentialOrdered + "\n Choose a key from the beginning of the array");
        KeySearchOrdered(SequentialOrdered, SequentialTime, SequentialContor);

        System.out.println("\nCase Unfavorable\n" + SequentialOrdered + "\n Choose a key from the end of the array");
        KeySearchOrdered(SequentialOrdered, SequentialTime, SequentialContor);

    }

    public static void BinarySearchMethod() throws IOException {

        long SequentialTime = 0;
        int SequentialContor = 0;
        System.out.println("\n BINARY Ordered Search");
        int ArrayLength = ArrayMaxLength();
        ArrayList<Integer> BinarySearch = new ArrayList<Integer>();
        createRandom(ArrayLength, BinarySearch);
        Collections.sort(BinarySearch);
        System.out.println(BinarySearch);
        BinaryKeySearch(BinarySearch, SequentialTime, SequentialContor);

    }

}
