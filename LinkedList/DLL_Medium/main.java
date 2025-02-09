class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
    Node(int data,Node next,Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
}
public class main {
    public static void printDLL(Node head){
        while(head != null){
            System.out.print(head.data+"<->");
            head = head.next;
        }
        System.out.print("null");
    }
    public static Node convert2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void main(String[] args) {
//        int[] arr = {2,2,10,8,4,2,5,2}; //Question-1
            int[] arr = {1,2,3,4,5,6,7,8,9};
        question1 q1 = new question1();
        Node head = convert2DLL(arr);
        head = q1.deleteAllOccurOfX(head,2);
        printDLL(head);
    }
}
