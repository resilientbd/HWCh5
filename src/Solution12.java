import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Year :");
        int in = scanner.nextInt();
        if ((in % 4) == 0 && (in % 100) == 0 && (in % 400) == 0) {
            System.out.println("Leap Year");
        } else if ((in % 4) == 0 && (in % 100) != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
