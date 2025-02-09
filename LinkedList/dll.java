class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class dll{
    public static void printDll(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node convert2dll(int[] nums){
        Node head = new Node(nums[0]);
        Node prev = head;
        for(int i=1;i<nums.length;i++){
            Node temp = new Node(nums[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head){
        if(head.next == null) return null;
        Node temp = head.next;
        head.next = null;
        temp.prev = null;
        return temp;
    }
    public static Node deleteTail(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node back = temp.prev;
        temp.prev = null;
        back.next = null;
        return head;
    }
    public static Node deleteKth(Node head,int k){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node front = temp.next;
        Node back = temp.prev;
        if(back == null && front == null){
            head = null;
            return head;
        }
        else if(back == null){
            head = head.next;
            head.prev = null;
            return head;
        }
        else if(front == null){
            Node tempa = temp.prev;
            tempa.next = null;
            temp.prev = null;
        }
        else{
            back.next = front;
            front.prev = back;
        }
        return head;
    }
    public static Node deleteValue(Node head,int value){
        if(head == null) return null;
        Node temp = head;
        while(temp.next != null){
            if(temp.data == value) break;
            temp = temp.next;
        }
        Node front = temp.next;
        Node back = temp.prev;
        back.next = front;
        front.prev = back;
        temp.next = temp.prev = null;
        return head;
    }
    public static Node insertBeforHead(Node head,int value){
        Node temp = head;
        Node tempb = new Node(value,temp,null);
        head = tempb;
        temp.prev = head;
        return head;
    }
    public static Node insertBeforeTail(Node head,int value){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(value,temp,back);
        back.next = newNode;
        temp.prev = newNode;
        return head;
    }
    public static Node insertBeforeK(Node head,int k,int value){
            if(k == 1 ||head.next == null ){
                return insertBeforHead(head, value);
            }
            Node temp = head.next;
            int cnt = 1;
            while(temp.next != null){
                cnt++;
                if(cnt == k){
                    Node temps = temp;
                    Node back = temp.prev;
                    Node newNode = new Node(value,temps,back);
                   back.next = newNode;
                   temps.prev = newNode;
                    break;
                }
                temp = temp.next;
            }
            if(temp.next == null){
                return insertBeforeTail(head, value);
            }
        return head;
    }
    // insert after values
    

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        Node head = convert2dll(arr);
        // head = deleteHead(head);
        // head = deleteTail(head);
        // head = deleteKth(head,5);
        // head = deleteValue(head, 0);
        // head = insertBeforHead(head, 4);     
        // head = insertBeforeTail(head, 10);
        // head = insertBeforeK(head, 5, 25);
        printDll(head);

    }
}