package CreateArrayL;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Root-World on 17.10.2015.
 * Hire are all arraylists that will be used in searching and sorting methods
 * 1 random arraylist with ( int maxsize,
 */
public class Arrays {
    // creates an random arraylist
    public static void  createRandom(int maxsize, ArrayList<Integer> list){
        Random random = new Random();
        for (int i = 0; i <= maxsize; i++) {
            list.add(random.nextInt(400));
        }
    }
}
