import java.util.*;
class NodeQ{
    int data;
    NodeQ next;
    NodeQ prev;
    NodeQ(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    NodeQ(int data,NodeQ next,NodeQ prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class question2 {
    public static ArrayList<ArrayList<Integer>> BruteForce(int target, NodeQ head){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        NodeQ temp1 = head;
        while (temp1 != null){
            NodeQ temp2 = temp1.next;
            while(temp2 != null && temp1.data + temp2.data <= target ){
                if(temp1.data + temp2.data == target){
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(temp1.data);
                    ans.add(temp2.data);
                    al.add(ans);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return al;
    }

    public static NodeQ findTail(NodeQ head){
        while(head.next != null){
            head = head.next;
        }
        NodeQ tail = head;
        return tail;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, NodeQ head){
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        NodeQ left = head;
        NodeQ rigth = findTail(head);
        while(left.data < rigth.data){
            if(left.data + rigth.data == target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(left.data);
                ans.add(rigth.data);
                x.add(ans);
                left = left.next;
                rigth = rigth.prev;
            } else if (left.data + rigth.data >= target) {
                rigth = rigth.prev;
            }
            else{
                left = left.next;
            }
        }
        return x;
    }


    public static NodeQ convert2DLL(int[] arr){
        NodeQ head = new NodeQ(arr[0]);
        NodeQ mover = head;
        for(int i=1;i<arr.length;i++){
            NodeQ temp = new NodeQ(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8,9};
        NodeQ head = convert2DLL(arr);
//        ArrayList<ArrayList<Integer>> ans = BruteForce(6,head);
        ArrayList<ArrayList<Integer>> ans = findPairsWithGivenSum(7,head);

        System.out.print(ans);
    }
}
