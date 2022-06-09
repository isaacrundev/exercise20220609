import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner start = new Scanner(System.in);
        System.out.println("Enter the start number ");
        int startnum = start.nextInt();
        Scanner end = new Scanner(System.in);
        System.out.println("Enter the end number ");
        int endnum = end.nextInt();
        for (int i = startnum; i <= endnum; i++) {
            System.out.println(i);
        }

        start.close();
        end.close();
    }
}
