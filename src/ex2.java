import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner inputN = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = inputN.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.printf("The sum of 1 to %d is %d", number, sum);
        inputN.close();
    }
}
