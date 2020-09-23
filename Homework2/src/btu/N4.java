package btu;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        int number;
        Scanner scanner_1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = scanner_1.nextInt();

        char [] charArrayOfNum = String.valueOf(number).toCharArray();

        for (int i=0; i<charArrayOfNum.length; i++) {
            System.out.println(charArrayOfNum[i]);
        }
    }

}
