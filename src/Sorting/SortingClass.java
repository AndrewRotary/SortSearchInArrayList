package Sorting;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static CreateArrayL.Arrays.createRandom;
import static InAndOut.ReadMax.ArrayMaxLength;
import static Sorting.SortingMethods.InsertionSort;
import static Sorting.SortingMethods.bubbleSort;
import static Sorting.SortingMethods.selectionSort;

/**
 * Created by Root-World on 17.10.2015.
 */
public class SortingClass {

    public static void BubleSortMethod() throws IOException {
        int ArrayLength = ArrayMaxLength();
        ArrayList<Integer> buble = new ArrayList<Integer>();
        createRandom(ArrayLength, buble);
        System.out.println("\nNot Sorted array:");
        System.out.println(buble);
        bubbleSort(buble);
        System.out.println("\nSorted array:");
        System.out.println(buble);
    }
    public static void SelectionSortMethod() throws IOException {
        int ArrayLength = ArrayMaxLength();
        ArrayList<Integer> SelectionSortArray = new ArrayList<Integer>();
        createRandom(ArrayLength, SelectionSortArray);
        System.out.println("\nNot Sorted array:");
        System.out.println(SelectionSortArray);
        selectionSort(SelectionSortArray);
        System.out.println("\nSorted array:");
        System.out.println(SelectionSortArray);
    }

    public static void InsertionSortMethod() throws IOException {
        int ArrayLength = ArrayMaxLength();
        ArrayList<Integer> InsertionSortArray = new ArrayList<Integer>();
        createRandom(ArrayLength, InsertionSortArray);
        System.out.println("\nNot Sorted array:");
        System.out.println(InsertionSortArray);
        InsertionSort(InsertionSortArray);
        System.out.println("\nSorted array:");
        System.out.println(InsertionSortArray);
    }
}
