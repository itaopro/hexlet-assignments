package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> storage;

    public InMemoryKV(Map<String, String> initialData) {
        this.storage = new HashMap<>(initialData);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }

    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));

        // Getting value by key
        System.out.println(storage.get("key", "default"));  // Output: "10"
        System.out.println(storage.get("unknown", "default"));  // Output: "default"

        // Setting new value
        storage.set("key2", "value2");
        System.out.println(storage.get("key2", "default"));  // Output: "value2"

        // Unsetting key
        storage.unset("key2");
        System.out.println(storage.get("key2", "default"));  // Output: "default"

        // Getting all data from storage
        Map<String, String> data = storage.toMap();
        System.out.println(data);  // Output: {key=10}
    }
}
// END
