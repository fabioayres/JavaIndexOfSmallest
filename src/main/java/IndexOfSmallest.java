
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> findSmallest = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999

        int minValue = 9998;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (minValue > input) {
                minValue = input;
            }
            if (input == 9999) {
                break;
            }
            findSmallest.add(input);
        }

        System.out.println("Smallest number: " + minValue);
        for (int i = 0; i < findSmallest.size(); i++) {
            if (findSmallest.get(i) == minValue) {
                System.out.println("Found at index " + i);
            }

        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
