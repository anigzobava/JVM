package btu;
import java.util.*;

public class N12 {
    public static void main(String[] args) {
        Random rand = new Random();

        Integer [] randomNumArray = new Integer[8];

        for(int i=0; i<randomNumArray.length; i++){
            randomNumArray[i] = rand.nextInt(1000);
        }
        System.out.printf("Random arr[] : %s", Arrays.toString(randomNumArray));

        Arrays.sort(randomNumArray, Collections.reverseOrder());

        System.out.println();
        System.out.printf("descending order arr[] : %s", Arrays.toString(randomNumArray));

    }
}