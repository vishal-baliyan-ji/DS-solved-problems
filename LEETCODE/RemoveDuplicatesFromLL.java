//LeetCode 83 Remove Duplicates from Sorted List
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
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
            
            
        }
        return head;
    }
}

public class RemoveDuplicatesFromLL {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.insertElement(1);
        l1.insertElement(2);
        l1.insertElement(2);
        l1.insertElement(3);
        l1.insertElement(3);
        l1.printList();
        l1.head =Solution.deleteDuplicates(l1.head);
        l1.printList();
    }
}
