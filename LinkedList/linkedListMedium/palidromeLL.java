import java.util.*;
class palidromeLL {
    public Node reverse(Node head){
        Node prev = null;
        Node temp = head;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }
        return prev;
    }
    public boolean bruteForce(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data != st.peek()) return false;
            temp = temp.next;
            st.pop();
        }
        return true;
    }
    public boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = slow;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = newHead;
        while (second != null){
            if(first.data != second.data) {
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }
}
