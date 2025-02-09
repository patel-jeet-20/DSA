class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class sll{
    public static void printll(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node convert2ll(int[] nums){
        Node head  = new Node(nums[0]);
        Node mover = head;
        for(int i=1;i<nums.length;i++){
            Node temp = new Node(nums[i]);
             mover.next = temp;
             mover = temp;
        }
        return head;
    }

    // Delete Operations

    public static Node deleteHead(Node head){
        if(head == null) return head;
        head = head.next;
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp != null){
            if(temp.next.next == null) {
                temp.next = null;
                break;}
            temp = temp.next;
        }   
        return head;
    }
    public static Node deleteKNode(Node head,int k){
        int cnt = 0;
        Node temp = head;
        if (head == null) return head;
        if (k == 1){
            head = head.next;
            return head;
        }
        while(temp != null){
            cnt++;
            if(cnt == k-1){
                Node front = temp.next;
                temp.next = temp.next.next;
                front.next = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node deleteValue(Node head,int v){ // v = value
        if (head == null) return head;
        if (head.data == v){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            if(temp.data == v){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // insert Operations

    public static Node insertHead(Node head,int value){
        if (head == null) return null;
        Node newNode = new Node(value, head);
        return newNode;
    }
    public static Node insertTail(Node head,int value){
        if(head == null) return null;
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }
    public static Node insertAtK(Node head,int value,int k){
        int cnt = 0;
        if(head == null) return null;
        if (k == 1) {
            return insertHead(head, value);
        }
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt+1 == k){
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }
    public static Node insertAtValue(Node head,int value,int v){
        if(head == null) return null;
        if (head.data == v) {
            return insertHead(head, value);
        }
        Node temp = head;
        boolean found = false;
        while(temp.next != null){
            if(temp.next.data == v){
                Node newNode = new Node(value,temp.next);
                temp.next = newNode;
                found = true;
                break;
            }
            temp = temp.next;
        }
        if(!found) System.out.println("not found");
        return head;
    }

     public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        Node head = convert2ll(arr);
        // head = deleteHead(head);
        // head = deleteTail(head);
        // head = deleteKNode(head, 3);
        // head = deleteValue(head, 8);
        // head = insertHead(head,4);
        // head = insertTail(head,10);
        // head = insertAtK(head,4,2);
        head = insertAtValue(head,60,6);
        printll(head);

    }
}