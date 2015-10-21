import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import CreateArrayL.Arrays;
import static CreateArrayL.Arrays.createRandom;
import static InAndOut.ReadMax.ArrayMaxLength;
import static Searching.SearchMethods.*;
import static SearchingKey.KeySearch.*;
import static Sorting.SortingClass.BubleSortMethod;
import static Sorting.SortingClass.InsertionSortMethod;
import static Sorting.SortingClass.SelectionSortMethod;

/*
The main goal is to analize the time and interchanges in a ArrayList using 3 Searching methods, and 6 sort methods
Search Methods:
    1. Seqvential clasic search a) Case sorted arraylist b) reverse sorted list c) shuffled list
    2. Seqvential in an ordered arraylist a)search the key from the begining of arraylist b) from the midle c) from the end
    3. Binary Search in an ordered arraylist a)search the key from the begining of arraylist b) from the midle c) from the end
Conclusion:
          I  return from 1,2,3 the nr. of searchings in an arraylist
          II time of searching in an arraylist
          III and save them in an text file
          IV additional compare them
Sorting Methods:
    1.Insertion Sort
    2.Selection Sort
    3.Buble Sort
Conclusion:
          I return nr of comparations and interchanges from a sorting method
          II return the time of sorting with the defined method
*/
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Search Methods:\n" +
                "    1. Seqvential clasic search a) Case sorted arraylist b) reverse sorted list c) shuffled list\n" +
                "    2. Seqvential in an ordered arraylist a)search the key from the begining of arraylist b) from the midle c) from the end\n" +
                "    3. Binary Search in an ordered arraylist a)search the key from the begining of arraylist b) from the midle c) from the end\n" +
                        "Sorting Methods:\n" +
                        "    4.Insertion Sort\n" +
                        "    5.Selection Sort\n" +
                        "    6.Buble Sort"
        );

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nIntroduceti operatiea dorita :\t");
        String swithcerS = reader.readLine();
        int switcher = Integer.parseInt(swithcerS);


        switch (switcher) {

            case 1:
                SequentialClasicMethod();
                break;
            case 2:
                SequentialOrderedMethod();
                break;
            case 3:
                BinarySearchMethod();
                break;
            case 4:
                InsertionSortMethod();
                break;
            case 5:
                SelectionSortMethod();
                break;
            case 6:
                BubleSortMethod();

        }
    }
    public static class Info {

        String name;
        int time;
        int comparations;
        int interchanges;

        public Info(String name, int time, int comparations, int interchanges) {

            this.name = name;
            this.time = time;
            this.comparations = comparations;
            this.interchanges = interchanges;
        }
}
// sortare metod