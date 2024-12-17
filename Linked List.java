
import java.util.LinkedList; 

public class LinkedListDemo  
{ 
    public static void main(String[] args) 
      { 
        // Create a LinkedList using Java's Collection Framework 
        LinkedList<Integer> list = new LinkedList<>(); 
        // Add elements to the list 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        // Display the list 
        System.out.println("Linked List: " + list); 
        // Remove an element 
        System.out.println("\nRemoving 20 from the list:"); 
        list.remove(Integer.valueOf(20)); // Removes the first occurrence of 20 
        System.out.println("Updated List: " + list); 
 
        // Try removing an element not in the list 
        System.out.println("\nRemoving 40 from the list:"); 
        if (!list.remove(Integer.valueOf(40)))  
      { 
            System.out.println("40 not found in the list."); 
        } 
        System.out.println("Final List: " + list); 
    } 
}