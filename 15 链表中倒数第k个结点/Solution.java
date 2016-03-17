/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null || k<=0){
			return null;
		}
        ListNode pNode=head;
		ListNode pNode2=head;
		ListNode test=head;
		int count=1;
		while(test.next!=null){
			test=test.next;
			count++;
		}
		if(k>count){
			return null;
		}
		if(k==count){
			return head;
		}
		for(int i=0;i<k;i++){
			pNode=pNode.next;
		}
		while(pNode!=null){
			pNode=pNode.next;
			pNode2=pNode2.next;
		}
		return pNode2;
    }
}