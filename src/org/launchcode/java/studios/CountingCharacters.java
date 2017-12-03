package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> characters = new HashMap<>();

        char[] charactersInString = testString.toCharArray();

        for (Character loopChar : charactersInString) {
            if (!characters.containsKey(loopChar)) {
                characters.put(loopChar, 1);
            } else {
                characters.put(loopChar, characters.get(loopChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
