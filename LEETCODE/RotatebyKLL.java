//LeetCode 61. Rotate List
class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
}
class LL{
    ListNode head;
    void insertElement(int element){
        ListNode newNode=new ListNode(element);
        if(head==null){
            head=newNode;
        }
        else{
            ListNode current =head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}


class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode dummyptr=head;
        int count =1;
        while(dummyptr.next!=null){
            dummyptr=dummyptr.next;
            count ++;
        }
        dummyptr.next=head;
        k=k%count;
        ListNode last=head;
        for(int i=1;i<count-k ;i++){
            last=last.next;
        }
        head=last.next;
        last.next=null;
        return head;
    }
}

public class RotatebyKLL {
    public static void main(String[] args) {
        LL l=new LL();
        l.insertElement(1);
        l.insertElement(2);
        l.insertElement(3);
        l.insertElement(4);
        l.insertElement(5);
        l.head=Solution.rotateRight(l.head,2);
        l.printList();

        
    }
}
