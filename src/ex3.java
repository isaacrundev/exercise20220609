import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String word = inputWord.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.printf("%s ", word);
        }
        System.out.printf("%n");
        inputWord.close();
    }
}
