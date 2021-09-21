import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Using For Loop

        int flag = 0;

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("Not prime");
            System.exit(0);
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println(num + " is prime");

        // Using While Loop

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Not prime");
            System.exit(0);
        }

        int counterFlag = 0;
        int i = 2;

        while (i < number) {

            if (number % i == 0) {
                System.out.println(number + " is not prime");
                counterFlag = 1;
                break;
            }
            i++;
        }

        if (counterFlag == 0)
            System.out.println(number + " is prime");

        scanner.close();
    }
}



