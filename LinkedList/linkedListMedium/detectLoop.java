import java.util.*;
public class detectLoop {
    public static boolean bruteForce(Node head){
        HashMap<Node, Integer> mpp = new HashMap<>();
        Node temp = head;
        while(temp != null){
            if(mpp.containsKey(temp)) return true;
            mpp.put(temp, 1);
            temp = temp.next;
        }
//        for(Map.Entry<Node, Integer> mp : mpp.entrySet()){
//            System.out.println(mp.getValue());
//        }
        return false;
    }
    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);

            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = second;

            if (hasCycle(head)) {
                System.out.println("Loop detected in the linked list.");
            } else {
                System.out.println("No loop detected in the linked list.");
            }
    }
}
