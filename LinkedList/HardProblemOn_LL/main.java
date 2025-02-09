class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
public class main {
    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.print("null");
    }
    public static Node Convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        question2 q2 = new question2();
        Node head = Convert2LL(arr);
        head = q2.rotateRight(head, 4);
        printLL(head);
    }
}
