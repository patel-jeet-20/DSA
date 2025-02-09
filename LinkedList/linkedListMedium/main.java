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
public class main {
    public static void PRINTLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static Node CONVERT2DLL(int[] nums){
        Node head  = new Node(nums[0]);
        Node mover = head;
        for(int i=1;i<nums.length;i++){
            Node temp = new Node(nums[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        middleElement me = new middleElement();
        reversingLL rll = new reversingLL();
        palidromeLL pll = new palidromeLL();
        oddEvenLL oe = new oddEvenLL();
        deleteFromEnd def = new deleteFromEnd();
        DeleteMiddleNode dmn = new DeleteMiddleNode();
//        sortLL sl = new sortLL();
//        sort0s_1sAnd2s s = new sort0s_1sAnd2s();
        addOneToLL aoll = new addOneToLL();

        int[] arr = {9,9,9,9};

        Node head = CONVERT2DLL(arr);

//        head = me.middleNode(head);

//        head = rll.iterativeApproach(head);
//        head = rll.recursiveApproach(head);

//        System.out.println(pll.isPalindrome(head));

//        head = oe.bruteForece(head);
//        head = oe.oddEvenList(head);

//        head = def.bruteForce(head, 5);
//        head = def.removeNthFromEnd(head, 2);

//        head = dmn.deleteMiddle(head);

//        head = sl.bruteForce(head);
//        head = sl.sortList(head);

//        head = s.bruteForce(head);
//        head = s.segregate(head);

//        head = aoll.iterative(head);
        head = aoll.addOne(head);
        PRINTLL(head);
    }
}
