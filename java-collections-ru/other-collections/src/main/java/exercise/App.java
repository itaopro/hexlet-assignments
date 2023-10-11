package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN

public class App {

    public static Map<String, String> genDiff(Map<String, Object> firstMap, Map<String, Object> secondMap) {
        Map<String, String> result = new LinkedHashMap<>();

        Set<String> keysFirst = firstMap.keySet();
        Set<String> keysSecond = secondMap.keySet();

        Set<String> addedKeys = new TreeSet<>(keysSecond);
        addedKeys.removeAll(keysFirst);
        for (String key : addedKeys) {
            result.put(key, "added");
        }

        Set<String> deletedKeys = new TreeSet<>(keysFirst);
        deletedKeys.removeAll(keysSecond);
        for (String key : deletedKeys) {
            result.put(key, "deleted");
        }

        Set<String> commonKeys = new TreeSet<>(keysFirst);
        commonKeys.retainAll(keysSecond);
        for (String key : commonKeys) {
            if (firstMap.get(key).equals(secondMap.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }

        return result;
    }
}
//END
