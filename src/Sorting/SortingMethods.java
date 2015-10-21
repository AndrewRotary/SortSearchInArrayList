package Sorting;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Root-World on 17.10.2015.
 */
public class SortingMethods {

    static int bubbleSort(ArrayList<Integer> list) {
        int contor = 0;
        int comparations = 0;
        Date currentTime = new Date();
        int count = 0;
        for (int outer = 0; outer < list.size() - 1; outer++) {
            comparations++;
            for (int inner = 0; inner < list.size() - outer - 1; inner++) {
                comparations++;
                if (list.get(inner) > list.get(inner + 1)) {
                    swapEm(list, inner);
                    count = count + 1;
                    contor++;
                }
            }
        }
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time: " + msDelay + " ms" + "\nInterchanges: " + contor + " operatii" + "\nComarations: " + comparations);
        return count;
    }
    static void swapEm(ArrayList<Integer> list, int inner) {
        int temp = list.get(inner);
        list.set(inner, list.get(inner + 1));
        list.set(inner + 1, temp);
    }

    //end of buble Sort
    //start Selection Sort
    public static void selectionSort(ArrayList<Integer> data) {
        int interchanges = 0;
        Date currentTime = new Date();
        int contor = 0;
        // just return if the array list is null
        if (data == null)

            return;

        // just return if the array list is empty or only has a single element
        if (data.size() == 0 || data.size() == 1)
            return;

        // declare an int variable to hold value of index at which the element
        // has the smallest value
        int smallestIndex;

        // declare an int variable to hold the smallest value for each iteration
        // of the outer loop
        int smallest;

        // for each index in the array list
        for (int curIndex = 0; curIndex < data.size(); curIndex++) {
            contor++;
			/* find the index at which the element has smallest value */
            // initialize variables
            smallest = data.get(curIndex);
            smallestIndex = curIndex;

            for (int i = curIndex + 1; i < data.size(); i++) {
                if (smallest > data.get(i)) {
                    interchanges++;
                    // update smallest
                    smallest = data.get(i);
                    smallestIndex = i;
                }
            }

			/* swap the value */
            // do nothing if the curIndex has the smallest value
            if (smallestIndex == curIndex)
                ;
                // swap values otherwise
            else {
                    interchanges++;
                    int temp = data.get(curIndex);
                    data.set(curIndex, data.get(smallestIndex));
                    data.set(smallestIndex, temp);
            }

        }
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time: " + msDelay + " ms" + "\nComparations: " + contor + "\nInterchanges: " + interchanges);
    }
    //Insertion sort
    public static void InsertionSort( ArrayList<Integer> list )
    {
        int interchanges = 0;
        Date currentTime = new Date();
        int contor = 0;
        int val;
        int holePos;

        // At the beginning of each iteration list[0..k-1] has been sorted, and the loop then
        // inserts element k into its proper place
        for( int k=1; k < list.size(); k++ )
        {   contor++;
            // make a copy of the value to insert
            val = list.get(k);

            // The kth position is where the "hole" starts
            holePos = k;

            // Move the "hole" left until we either get the the end of the array
            // or the element left of the hole is <= to the value we're inserting
            while( holePos > 0 && list.get(holePos-1) > val )
            {

                interchanges++;
                // move the hole to the left
                list.set( holePos, list.get(holePos-1) );
                holePos--;
            }

            // copy the value into the hole
            list.set( holePos, val );
        }
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time: " + msDelay + " ms" + "\nComparations: " + contor + "\nInterchanges: " + interchanges);
    }
}
