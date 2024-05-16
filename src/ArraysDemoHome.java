import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysDemoHome {
    public static void main(String[] args) {
        // 1.
        int[] numbers = {6,3,13,9};
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("---------");
        // 2.
        int sum = Arrays.stream(numbers).sum();
        double average = sum / 4.0;
        System.out.println(average);
        System.out.println("---------");
        // 3.
        int min = numbers[0];
        int max = numbers[0];
        for (int index = 1;index < 4;index++) {
            if (max > numbers[index]) {
                max = numbers[index];
            }
        }
        for (int index = 1;index < 4;index++) {
            if (min < numbers[index]) {
                min = numbers[index];
            }
        }
        System.out.println(max);
        System.out.println(min);
        // 4.
        System.out.println("---------");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println("even:" + num);
            }
            else {
                System.out.println("odd:" + num);
            }
        }
        System.out.println("----------");
        // 5.
        for (int num : numbers) {
            boolean print = true;
            if (num > 1) {
                for (int divider = 2;divider <= Math.sqrt(num);divider++) {
                    if (num % divider == 0) {
                        print = false;
                        break;
                    }
                }
                if (print) {
                    System.out.println("this number " + num + " is prime");
                }
                else {
                    System.out.println("this number " + num + " is not prime");
                }
            }
        }
        System.out.println("----------");
        // 6.
        boolean swaped = true;
        int counter = 1;
        while (swaped) {
            swaped = false;
            for (int index = 0;index < 4 - counter;index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
            counter++;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}