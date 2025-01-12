
import java.util.*;

@SuppressWarnings("unused")
public class linkedHashMap {

    public static void main(String[] args) {

        // Initialize a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Apple", 1);                    // Add a key-value pair
        map.put("Banana", 2);                   // Add another key-value pair
        map.put("Cherry", 3);                   // Add another key-value pair
        System.out.println(map);                // Output: {Apple=1, Banana=2, Cherry=3}

        map.get("Apple");                       // Get value by key (Output: 1)
        map.getOrDefault("Apple", 0);           // Get value or default if key is missing
        map.remove("Banana");                   // Remove key-value pair by key
        map.entrySet().removeIf(entry -> entry.getValue() < 3); // Remove entries with value < 3
        map.clear();                            // Remove all key-value pairs
        map.size();                             // Get the size of the map (Output: 0 if empty)

        map.containsKey("Apple");               // Check if key exists (Output: true/false)
        map.containsValue(2);                   // Check if value exists (Output: true/false)
        map.isEmpty();                          // Check if map is empty (Output: true/false)

        map.forEach((key, value) -> System.out.println(key + " -> " + value)); // Iterate using forEach

        // Using entrySet and for-each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Using keySet and for-each loop
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        // Using values and for-each loop
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // Using Iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        Set<String> keys = map.keySet();        // Get a set of keys
        Collection<Integer> values = map.values(); // Get a collection of values
        Set<Map.Entry<String, Integer>> entries = map.entrySet(); // Get a set of entries

        List<String> keysList = new ArrayList<>(map.keySet()); // Convert keys to a list
        List<Integer> valuesList = new ArrayList<>(map.values()); // Convert values to a list

        // LinkedHashMap-Specific Features
        // Access order based on insertion or access
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("Apple", 1);
        accessOrderMap.put("Banana", 2);
        accessOrderMap.get("Apple");            // Moves "Apple" to the end of the map
        System.out.println(accessOrderMap);     // Output: {Banana=2, Apple=1}

        map.putIfAbsent("Date", 4);             // Add a key-value pair if key is absent
        map.replace("Apple", 5);                // Replace value for key "Apple"
        map.replace("Cherry", 3, 6);            // Replace value only if current value is 3

        map.compute("Apple", (key, val) -> val + 1); // Compute a new value for key "Apple"
        map.computeIfAbsent("Fig", key -> 7);   // Compute and add if key is absent
        map.computeIfPresent("Cherry", (key, val) -> val * 2); // Compute if key is present

        map.merge("Apple", 10, Integer::sum);   // Merge value with current value for key "Apple"

    }
}
