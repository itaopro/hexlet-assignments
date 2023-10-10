package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : sentence.split(" ")) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder sb = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

}
//END
