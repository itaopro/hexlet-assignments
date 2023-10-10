package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String chars, String word) {

        chars = chars.toLowerCase();
        word = word.toLowerCase();

        List<Character> charsList = new ArrayList<>();
        for (char c : chars.toCharArray()) {
            charsList.add(c);
        }

        for (char c : word.toCharArray()) {
            if (charsList.contains(c)) {
                charsList.remove((Character) c);
            } else {
                return false;
            }
        }
        return true;
    }

}
//END
