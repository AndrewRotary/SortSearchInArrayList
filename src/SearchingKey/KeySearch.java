package SearchingKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static InAndOut.ReadMax.EnterKey;
import static InAndOut.ReadMax.EnterKeyOrdered;

/**
 * Searcs the key you need in the arraylist
 */
public class KeySearch {

    public static int KeySearch (ArrayList<Integer> data, long msDelay, int contor) throws IOException{
        contor = 1;
        int key = EnterKey();
        Date currentTime = new Date();
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).equals(key))
            {System.out.println("Interchanges: " + contor);
                break;}
            else
                contor++;

        }
        Date newTime = new Date();
        msDelay = newTime.getTime() - currentTime.getTime();
        return key;
    }

    public static void KeySearchEntered(ArrayList<Integer> data, long msDelay, int contor,int key){
        contor = 1;
        Date currentTime = new Date();
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).equals(key))
            {
                System.out.println("Interchanges: " + contor);
                break;}
            else
                contor++;

        }
        Date newTime = new Date();
        msDelay = newTime.getTime() - currentTime.getTime();
    }

    public static int KeySearchOrdered (ArrayList<Integer> data, long msDelay, int contor) throws IOException{
        contor = 1;
        int key = EnterKeyOrdered();
        Date currentTime = new Date();
        for (int i = 0; i < data.size(); i++)
            if (data.get(i) <= key) {
                if (data.get(i).equals(key))
                {System.out.println("Interchanges: " + contor);
                    break;}
                    else
                    contor++;
            } else {
                System.out.println("Teh searching is stopped it reached the number: " + data.get(i) + " that is grater than: " + key);
                System.out.println("Interchanges: " + contor);
                break;
            }
        Date newTime = new Date();
        msDelay = newTime.getTime() - currentTime.getTime();
        return key;
    }

    public static boolean BinaryKeySearch(ArrayList<Integer> data, long msDelay, int contor) throws IOException {
        boolean variable = false;
        contor = 1;
        int key = EnterKey();
        Date currentTime = new Date();
        int low = 0;
        int high = data.size() -1;
        while(high >= low) {
            contor++;
            int middle = (low + high) / 2;
            if(data.get(middle) == key)
            {
                variable = true;
                break;
            }
            if(data.get(middle) < key){
                low = middle +1;
            }
            if(data.get(middle) > key){
                high = middle - 1;
            }
        }
        Date newTime = new Date();
        msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Interchanges: " + contor);
        System.out.println("The time is: " + msDelay + " ms");
        if(variable)
            return true;
        else
        {
            System.out.println("\nThe number: " + key + " was not found");
            return false;
        }

    }
}
