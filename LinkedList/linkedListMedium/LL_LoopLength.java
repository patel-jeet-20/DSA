import java.util.*;
public class LL_LoopLength {
    public static int bruteForce(Node head){
        Map<Node, Integer> mpp = new HashMap<>();
        int timer = 1;
        Node temp = head;
        while (temp != null){
            if(mpp.containsKey(temp)){
                int value = mpp.get(temp);
                return timer - value;
            }
            mpp.put(temp, timer);
            timer++;
            temp = temp.next;
        }
        return 0;
    }
    public static int loopLength(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                fast = fast.next;
                int cnt = 1;
                while (slow != fast){
                    cnt++;
                    fast = fast.next;
                }
                return cnt;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        int loopLength = loopLength(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
