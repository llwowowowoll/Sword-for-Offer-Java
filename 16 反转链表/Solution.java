/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }  
            ListNode nextNode = head.next;  
            head.next = null;  
            while(nextNode!=null)  
            {  
                ListNode nextNextNode = nextNode.next;  
                nextNode.next = head;  
                head = nextNode;  
                nextNode = nextNextNode;  
            }  
            return head; 
    }
}