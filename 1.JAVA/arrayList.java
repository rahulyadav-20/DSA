
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");                      // Add an element
        list.add(1, "Banana");                  // Add element at specific index
        list.addAll(List.of("Cherry", "Date")); // Add all elements from a collection
        System.out.println(list);               // Output: [Apple, Banana, Cherry, Date]

        String fruit = list.get(1);             // Get element at index
        System.out.println(fruit);               // Output: Banana    
        int index = list.indexOf("Cherry");     // Get the first index of an element
        System.out.println(index);               // Output: 2   
        boolean exists = list.contains("Date"); // Check if list contains an element
        System.out.println(exists);              // Output: true

        list.set(1, "Blueberry");               // Replace element at index 1

        list.remove(2);                         // Remove element at specific index
        list.remove("Date");                    // Remove first occurrence of a specific element
        list.clear();                           // Remove all elements

        System.out.println(list.isEmpty());     // Check if list is empty -> Output: true
        System.out.println(list.size());        // Get the size of the list -> Output: 0

        // Re-add elements for further operations
        list.addAll(List.of("Apple", "Banana"));

        list.addAll(List.of("Apple", "Banana", "Cherry", "Date")); // Add elements to the list
        Collections.sort(list);                 // Sort list in natural order
        Collections.sort(list, (a, b) -> b.compareTo(a)); // Sort in reverse order

        //1. Using for Loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //2. Using Enhanced for Loop
        for (String item : list) {
            System.out.println(item);
        }
        //3. Using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //4. Using ListIterator (Bidirectional)
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());  // Forward direction
        }
        // Output: Apple, Banana
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());  // Backward direction
        }
        // Output: Banana, Apple

        //5. Using Lambda (Java 8+)
        list.forEach(item -> System.out.println(item));

        //Converting to Other Data Structures
        Object[] array = list.toArray();        // Convert to array
        List<String> newList = new ArrayList<>(list); // Clone list

        //Stream API (Java 8+)
        list.stream()
                .filter(item -> item.startsWith("B")) // Filter items starting with 'B'
                .forEach(System.out::println);       // Output: Banana

        //Sublist
        List<String> subList = list.subList(1, 3); // Extract sublist from index 1 to 2
        System.out.println(subList);              // Output: [Banana, Cherry]

        //Merging Lists
        List<String> anotherList1 = List.of("Elderberry", "Fig");
        list.addAll(anotherList1);                // Append all elements of another list
        System.out.println(list);                // Output: [Apple, Banana, Cherry, Date, Elderberry, Fig]

        //Checking Equality
        List<String> anotherList2 = List.of("Apple", "Banana", "Cherry", "Date");
        System.out.println(list.equals(anotherList2)); // Compare lists for equality -> Output: false

        //Retaining Elements
        list.retainAll(List.of("Apple", "Cherry")); // Retain only these elements
        System.out.println(list);                   // Output: [Apple, Cherry]

        //Removing Duplicates
        list.addAll(List.of("Apple", "Cherry", "Apple"));
        List<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(uniqueList);           // Output: [Apple, Cherry]

    }
}
