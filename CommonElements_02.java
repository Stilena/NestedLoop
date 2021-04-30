import java.util.Arrays;
import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        for (String s : arr2) {
            for (String p : arr1) {
                if (s.equals(p)) {
                    System.out.print(s + " ");
                    break;
                }
            }
        }
    }
}

