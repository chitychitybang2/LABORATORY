package lab6_laforteza;

import java.util.*;

public class LAB6_LAFORTEZA {
    
    public static void main(String[] args) {
        
        System.out.println("========================================================");
        System.out.println("LABORATORY 6 Java Sequences and Iterators Demonstration");
        System.out.println("========================================================");       
        
        // Part 1 & 2: ArrayList and LinkedList with 5 elements
        demonstrateArrayList();
        System.out.println();
        demonstrateLinkedList();
        System.out.println();
        
        // Part 4, 5 & 6: Custom Generic Sequence with Iterator
        demonstrateCustomSequence();
    }
    
    // Demonstrate ArrayList
    private static void demonstrateArrayList() {
        System.out.println("--- ArrayList Demonstration ---");
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Insert 5 elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");
        
        System.out.println("ArrayList contains: " + arrayList.size() + " elements\n");
        
        // Standard for loop
        System.out.println("Using Standard for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("  [" + i + "] " + arrayList.get(i));
        }
        System.out.println();
        
        // Enhanced for-each loop
        System.out.println("Using Enhanced for-each loop:");
        for (String fruit : arrayList) {
            System.out.println("  " + fruit);
        }
        System.out.println();
        
        // Java Iterator
        System.out.println("Using Java Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
    
    // Demonstrate LinkedList
    private static void demonstrateLinkedList() {
        System.out.println("--- LinkedList Demonstration ---");
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Insert 5 elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        
        System.out.println("LinkedList contains: " + linkedList.size() + " elements\n");
        
        // Standard for loop
        System.out.println("Using Standard for loop:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("  [" + i + "] " + linkedList.get(i));
        }
        System.out.println();
        
        // Enhanced for-each loop
        System.out.println("Using Enhanced for-each loop:");
        for (Integer number : linkedList) {
            System.out.println("  " + number);
        }
        System.out.println();
        
        // Java Iterator
        System.out.println("Using Java Iterator:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
    
    // Demonstrate Custom Generic Sequence
    private static void demonstrateCustomSequence() {
        System.out.println("--- Custom Generic Sequence<T> Demonstration ---");
        Sequence<String> customSequence = new Sequence<>();
        
        // Add 5 elements
        System.out.println("Adding 5 elements to custom sequence...");
        customSequence.add("Java");
        customSequence.add("Python");
        customSequence.add("C++");
        customSequence.add("JavaScript");
        customSequence.add("Ruby");
        
        System.out.println("Custom Sequence contains: " + customSequence.size() + " elements\n");
        
        // Retrieve elements by index
        System.out.println("Retrieving elements by index:");
        for (int i = 0; i < customSequence.size(); i++) {
            System.out.println("  [" + i + "] " + customSequence.get(i));
        }
        System.out.println();
        
        // Using custom iterator (enhanced for-each)
        System.out.println("Iterating using custom inner iterator (for-each):");
        for (String language : customSequence) {
            System.out.println("  " + language);
        }
        System.out.println();
        
        // Using custom iterator (explicit)
        System.out.println("Iterating using custom inner iterator (explicit):");
        Iterator<String> iterator = customSequence.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}
