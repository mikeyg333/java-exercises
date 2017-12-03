package exercises.Class2;

import java.util.ArrayList;
import java.util.Arrays;

public class WordsWithFiveLetters {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Writer", "a", "static", "method", "to", "printer", "out", "each", "word",
                "in", "a", "list", "that", "has", "exactly", "5", "letters"));
        ArrayList<String> fiveLetterWords = new ArrayList<>();

        System.out.println("The five letter words in the given sentence are: ");

        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
                fiveLetterWords.add(word);
            }
        }

        if (fiveLetterWords.size() == 0) {
            System.out.println("No words found with exactly 5 letters.");
        }
    }
}
