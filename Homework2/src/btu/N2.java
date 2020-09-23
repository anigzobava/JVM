package btu;
import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        int firstNum;
        Scanner scanner_1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstNum = scanner_1.nextInt();

        int secondNum;
        Scanner scanner_2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        secondNum = scanner_2.nextInt();

        System.out.println();
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
        System.out.println(secondNum + " % " + firstNum + " = " + (secondNum%firstNum) + " (remainder)");

    }
}