import java.util.*;
public class sortLL {
//    public void merge(int[] arr, int l, int mp, int h) {
//        int n1 = mp - l + 1;
//        int n2 = h - mp;
//        int[] arr1 = new int[n1];
//        int[] arr2 = new int[n2];
//        for (int i = 0; i < n1; i++) {
//            arr1[i] = arr[i + l];
//        }
//        for (int i = 0; i < n2; i++) {
//            arr2[i] = arr[mp + 1 + i];
//        }
//        int i = 0, j = 0, k = l;
//        while (i < n1 && j < n2) {
//            if (arr1[i] <= arr2[j]) {
//                arr[k] = arr1[i];
//                i++;
//            } else {
//                arr[k] = arr2[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < n1) {
//            arr[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while (j < n2) {
//            arr[k] = arr2[j];
//            j++;
//            k++;
//        }
//
//    }
//
//    public void mergeSort(int[] arr, int l, int h) {
//        if (l < h) {
//            int mid = (l + h) / 2;
//            mergeSort(arr, l, mid);
//            mergeSort(arr, mid + 1, h);
//            merge(arr, l, mid, h);
//        }
//    }
//
//    public Node bruteForce(Node head) {
//        List<Integer> al = new ArrayList<>();
//        Node temp = head;
//        while (temp != null) {
//            al.add(temp.data);
//            temp = temp.next;
//        }
//        int[] arr = al.stream().mapToInt(i -> i).toArray();
//        mergeSort(arr, 0, arr.length - 1);
//        Node newHead = new Node(arr[0]);
//        Node mover = newHead;
//        for (int i = 1; i < arr.length; i++) {
//            Node newTemp = new Node(arr[i], null);
//            mover.next = newTemp;
//            mover = newTemp;
//        }
//        return newHead;
//    }

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node Merge(Node firstList, Node secondList){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(firstList != null && secondList != null){
            if(firstList.data <= secondList.data){
                temp.next = firstList;
                firstList = firstList.next;
            }
            else{
                temp.next = secondList;
                secondList = secondList.next;
            }
            temp = temp.next;
        }
        if(firstList != null){
            temp.next = firstList;
        }else{
            temp.next = secondList;
        }
        return dummyNode.next;
    }
    public Node sortList(Node head) {
        if (head == null || head.next == null) return head;
        Node middle = middleNode(head);

        Node firstHead = head;
        Node secondHead = middle.next;
        middle.next = null;
        firstHead = sortList(firstHead);
        secondHead = sortList(secondHead);

        return Merge(firstHead, secondHead);

    }
}