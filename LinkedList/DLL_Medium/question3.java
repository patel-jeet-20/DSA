class Node3{
    int data;
    Node3 next;
    Node3 prev;
    Node3(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node3(int data,Node3 next,Node3 prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class question3 {
    public static void printll(Node3 head){
        System.out.print("null<->");
        while (head != null){
            System.out.print(head.data+"<->");
            head = head.next;
        }
        System.out.print("null");
    }
    public static Node3 removeDuplicates(Node3 head){
        Node3 temp = head;
        while(temp != null && temp.next != null){
            Node3 nextNode = temp.next;
            while (nextNode != null && temp.data == nextNode.data){
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if(nextNode != null) nextNode.prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node3 connvert2DLL(int[] arr){
        Node3 head = new Node3(arr[0]);
        Node3 mover = head;
        for(int i=0;i<arr.length;i++){
            Node3 temp = new Node3(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node3 head = connvert2DLL(arr);
        head = removeDuplicates(head);
        printll(head);
    }
}
