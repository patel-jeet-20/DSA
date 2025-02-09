public class question1 {
    public Node deleteAllOccurOfX(Node head,int x){
        Node temp = head;
        while(temp != null){
            if(temp.data == x){
                if(temp == head){
                    head = head.next;
                }
                Node newNode = temp.next;
                Node prevNode = temp.back;
                if(newNode != null) newNode.back = prevNode;
                if(prevNode != null) prevNode.next = newNode;

                temp = newNode;
            }
            else temp = temp.next;
        }
        return head;
    }
}
