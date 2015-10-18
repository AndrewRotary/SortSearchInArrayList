package InAndOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Root-World on 17.10.2015.
 */
public class ReadMax {
    public static int ArrayMaxLength() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the length for array:");
        String intMaxS = reader.readLine();
        int intMax = Integer.parseInt(intMaxS);
        return intMax;
    }

    public static int EnterKey() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the digit you are looking for");
        String keyS = reader.readLine();
        int key = Integer.parseInt(keyS);
        return key;
    }

    public static int EnterKeyOrdered() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyS = reader.readLine();
        int key = Integer.parseInt(keyS);
        return key;
    }
}
