//LeetCode 206 Reverse Linked List
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
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;
        }
        
        
        return prev;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.insertElement(1);
        l1.insertElement(2);
        l1.insertElement(3);
        l1.insertElement(4);
        l1.insertElement(5);
        l1.printList();
        l1.head =Solution.reverseList(l1.head);
        l1.printList();
    }
}
