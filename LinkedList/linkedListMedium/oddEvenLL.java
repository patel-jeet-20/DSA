import java.util.*;
class oddEvenLL {
    public Node bruteForece(Node head){
        if(head == null || head.next == null) return head;
        List<Integer> al = new ArrayList<>();
        Node temp = head;
        while(temp != null && temp.next!=null){
            al.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) al.add(temp.data);
        temp = head.next;
        while(temp != null && temp.next!=null){
            al.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) al.add(temp.data);
        temp = head;
        int i=0;
        while(temp != null){
            temp.data = al.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }

    public Node oddEvenList(Node head){
        Node odd = head;
        Node even  = head.next;
        Node evenHead  = head.next;
        while (odd != null && odd.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;

        }
        odd.next = evenHead;
        return head;
    }

}
