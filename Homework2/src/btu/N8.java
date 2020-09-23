package btu;
import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        int firstNum;
        Scanner scanner_1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        firstNum = scanner_1.nextInt();

        int secondNum;
        Scanner scanner_2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        secondNum = scanner_2.nextInt();

        if(firstNum < secondNum) {
            for (int num = firstNum; num < secondNum; num++) {
                System.out.println(num);
            }
        }
        else {
            System.out.println("The second number is not more than the first number.");
        }
    }

}
