import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers will be added?");
        int howmany = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < howmany; i++) {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.printf("The sum is %d%n", sum); 
        sc.close();
    }
}
