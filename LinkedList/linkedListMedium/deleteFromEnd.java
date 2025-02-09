public class deleteFromEnd {
    public Node bruteForce(Node head,int k){
        int cnt = 0;
        Node temp = head;
        while (temp != null){
            cnt++;
            temp = temp.next;
        }
        if(cnt == k){
            head = head.next;
            return head;
        }
        temp = head;
        while(temp != null){
            if(cnt == (k+1)){
                Node front = temp.next;
                temp.next = temp.next.next;
                front = null;
                break;
            }
            temp = temp.next;
            cnt--;
        }
        return head;
    }

    public Node removeNthFromEnd(Node head,int k){
        Node fast = head;
        for(int i=0;i<k;i++) fast = fast.next;
        Node slow = head;
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return head;
    }

}
