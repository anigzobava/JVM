package btu;
import java.util.Arrays;

public class N9 {
    public static void main(String[] args) {
        int numbers[] = {3, 2, 9, 4, 6, 16, 7, 0};


        System.out.printf("Numbers : %s", Arrays.toString(numbers));
        System.out.println();
        System.out.println("Maximum = " + getMaxValue(numbers));
        System.out.println("Minimum = " + getMinValue(numbers));

    }

    private static int getMaxValue(int[] numbers) {
        int maxValue = numbers[0];
        for(int i=1; i < numbers.length; i++){
            if(maxValue < numbers[i]) {
                maxValue = numbers[i];
            }
        }

        return maxValue;
    }

    private static int getMinValue(int[] numbers) {
        int minValue = numbers[0];
        for(int i=1;i < numbers.length; i++){
            if(minValue > numbers[i]) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }

}
