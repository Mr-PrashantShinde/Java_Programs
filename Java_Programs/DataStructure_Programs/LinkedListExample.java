/**
 * Node class
 */
class Node {
    int value;
    Node next;

    Node(int d){
        value = d;
        next = null;
    }
}


/**
 * LinkedListExample
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // first element
        Node first = new Node(5);
        //first = 5;

        //second element
        Node middle = new Node(10);
        //middle = 10;

        // assigning reference to next
        first.next = middle; 

        // last element
        Node last = new Node(26);
        //last = 23;

         // assigning reference to next
         middle.next = last;

         // printing list
         printList(first);


    }
    private static void printList(Node node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
 
