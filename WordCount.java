import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        // split() breaks sentence into words by spaces
        String[] words = sentence.split("\\s+");

        System.out.println("Number of words     : " + words.length);
        System.out.println("Number of characters: " + sentence.length());

        System.out.println("Words are:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("  " + (i + 1) + ". " + words[i]);
        }
    }
}