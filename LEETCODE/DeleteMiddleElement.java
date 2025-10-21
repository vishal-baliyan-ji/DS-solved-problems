//2095. Delete the Middle Node of a Linked List
//Full implementation is commented down to run on java compiler

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
}
/*class LL{
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
*/
public class DeleteMiddleElement {
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode fastptr=head.next.next;
        ListNode slowptr=head;
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            
        }
        
        slowptr.next=slowptr.next.next;
        return head;
    }
/*    public static void main(String[] args) {
        LL l=new LL();
        l.insertElement(1);
        l.insertElement(2);
        l.insertElement(3);
        l.insertElement(4);
        deleteMiddle(l.head);
        l.printList();

        
    }*/
}
