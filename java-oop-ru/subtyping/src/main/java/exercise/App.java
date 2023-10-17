package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> originalMap = storage.toMap();
        Map<String, String> swappedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        // Clear the original storage
        for (String key : originalMap.keySet()) {
            storage.unset(key);
        }

        // Populate storage with swapped key-value pairs
        for (Map.Entry<String, String> entry : swappedMap.entrySet()) {
            storage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
