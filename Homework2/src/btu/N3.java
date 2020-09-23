package btu;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        int firstNum;
        Scanner scanner_1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstNum = scanner_1.nextInt();

        int secondNum;
        Scanner scanner_2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        secondNum = scanner_2.nextInt();

        int thirdNum;
        Scanner scanner_3 = new Scanner(System.in);
        System.out.print("Enter the third number: ");
        thirdNum = scanner_3.nextInt();

        System.out.println();
        System.out.println("sum = " + (firstNum + secondNum + thirdNum));
        System.out.println("Multiplication = " + (firstNum * secondNum * thirdNum));

    }

}
