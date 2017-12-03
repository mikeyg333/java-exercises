package exercises.Class1;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String term;
        Scanner in = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What term would you" +
                " like to search for in the following" +
                " sentence?");
        System.out.println(sentence);

        term = in.next();

        if (sentence.toUpperCase().contains(term.toUpperCase())) {
            System.out.println("Search term found!");
        } else {
            System.out.println("Search term not found");
        }
    }
}
