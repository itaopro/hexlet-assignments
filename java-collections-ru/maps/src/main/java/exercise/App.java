package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();


        for (String word : sentence.split(" ")) {
            if (word.isEmpty()) continue;
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }

        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder("{\n");
        for (String key : wordsCount.keySet()) {
            sb.append("  ").append(key).append(": ").append(wordsCount.get(key)).append("\n");
        }
        sb.append("}");

        return sb.toString();
    }

}
//END
