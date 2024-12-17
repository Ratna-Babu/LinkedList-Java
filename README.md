# Linked List in Data Structures

## What is a Linked List?
A **Linked List** is a linear data structure in which elements, called **nodes**, are connected using pointers. Each node contains two parts:
1. **Data**: The actual value stored in the node.
2. **Next**: A reference (or pointer) to the next node in the sequence.

The last node points to `null`, indicating the end of the list. Linked lists can be of various types, such as:
- **Singly Linked List**: Each node points to the next node.
- **Doubly Linked List**: Each node points to both the next and the previous nodes.
- **Circular Linked List**: The last node points back to the first node, forming a circle.

## Example of a Singly Linked List
Imagine we have a list of numbers: `10 -> 20 -> 30`. Each number represents the data in a node, and the arrows represent the pointers to the next node.

## Java Implementation of a Linked List
The Java Collection Framework provides a ready-to-use `LinkedList` class in the `java.util` package. This class implements both the **List** and **Deque** interfaces, making it versatile for various use cases.

Below is an example code demonstrating basic operations with a LinkedList:

### Code
```java
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
```
## Output
```
Linked List: [10, 20, 30]

Removing 20 from the list:
Updated List: [10, 30]

Removing 40 from the list:
40 not found in the list.
Final List: [10, 30]

```
