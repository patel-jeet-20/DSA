import java.util.*;
class startLoop {
    public static Node BruteForce(Node head){
        Map<Node, Integer> mpp = new HashMap<>();
        Node temp = head;
        while (temp != null){
            if(mpp.containsKey(temp)){
                return temp;
            }
            mpp.put(temp,1);
            temp = temp.next;
        }
        return null;
    }
    public static Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
             return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;

        node5.next = node2;

        Node head = node1;

        Node loopStartNode = detectCycle(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");

        }
    }
}
