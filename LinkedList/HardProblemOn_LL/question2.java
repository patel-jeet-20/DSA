public class question2 {
    public Node rotateRight(Node head,int k){
        if(k == 0 || head == null) return head;
        int len = 1;
        Node temp = head;
        while (temp.next != null){
            len++;
            temp = temp.next;
        }
        if(k % len == 0) return head;
        k = k % len;
        temp.next = head;
        Node newLastNode = newHead(head, len-k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
    public static Node newHead(Node temp, int k){
        int cnt = 1;
        while (temp != null){
            if(cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
}
