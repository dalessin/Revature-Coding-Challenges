import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a number, and I'll tell you if it's odd or be'in even\n");
        int number = scanner.nextInt();

        if (number % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
        scanner.close();
    }
}