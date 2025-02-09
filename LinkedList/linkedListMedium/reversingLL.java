public class reversingLL {
    public Node iterativeApproach(Node head){
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
    public Node recursiveApproach(Node head){
        if(head == null || head.next == null) return head;
        Node newNode = recursiveApproach(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }
}
