import java.util.Arrays;
import java.util.Scanner;

public class CondenceArrayToNum_07LAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;

        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            int[] condensed = new int[arr.length - 1];

            for (int j = 0; j < condensed.length; j++) {
                condensed[j] = arr[j] + arr[j + 1];

            }
            arr = condensed;

            sum = condensed[0];
        }
        System.out.println(sum);
    }
}
/*import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] numbersAsStrings = input.split(" ");
        int[] numbers = new int[numbersAsStrings.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        while (numbers.length > 1) {

            int[] numbersCondensed = new int[numbers.length - 1];

            for (int i = 0; i < numbersCondensed.length; i++) {
                numbersCondensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = numbersCondensed;
        }

        System.out.println(numbers[0]);

    }
}*/