import java.util.*;
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
public class reverseDll{
    public static Node convert2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp  = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void printDLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node naiveSol(Node head){
        Stack<Integer> st = new Stack<Integer>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node reverse_DLL(Node head) {
        if(head == null || head.next == null) return head;
        Node current = head;
        Node last = null;
        while(current != null){
            last = current.back;
            current.back = current.next;
            current.next = last;
            current = current.back;
        }
        return last.back;
        // Your code here
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Node head = convert2DLL(arr);
        head = reverse_DLL(head);
        printDLL(head);
    }
}