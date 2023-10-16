package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage database) {
        Map<String, String> originalMap = database.toMap();
        Map<String, String> swappedMap = new HashMap<>();

        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        for (String key : originalMap.keySet()) {
            database.unset(key);
        }

        for (Map.Entry<String, String> entry : swappedMap.entrySet()) {
            database.set(entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> initialData = Map.of("key1", "value1", "key2", "value2");
        KeyValueStorage storage = new InMemoryKV(initialData);

        System.out.println("Before swap: " + storage.toMap());
        swapKeyValue(storage);
        System.out.println("After swap: " + storage.toMap());
    }
}
// END
