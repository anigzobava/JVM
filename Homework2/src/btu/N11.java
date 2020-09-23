package btu;
import java.util.Arrays;
import java.util.Random;

public class N11 {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumArray [] = new int [8];

        for(int i=0; i<randomNumArray.length; i++){
            randomNumArray[i] = rand.nextInt(1000);
        }
        System.out.printf("Random arr[] : %s", Arrays.toString(randomNumArray));
    }

}
