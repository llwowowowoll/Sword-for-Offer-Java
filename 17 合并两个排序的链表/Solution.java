/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/



public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode pNew = null;
    	ListNode pHead = null;
    	ListNode p1 = list1;
    	ListNode p2 = list2;
    	
    	if(list1 ==null){
    		return list2;
    	}else if(list2 ==null){
    		return list1;
    	}
    	
    	if(list1.val<=list2.val){
        	pNew = list1;
        	p1 = p1.next;
        	pHead = pNew;
        }else{
        	pNew = list2;
        	p2 = p2.next;
        	pHead = pNew;
        }
    	
    	while(p1!=null&&p2!=null){
    		if(p1.val<=p2.val){
    			pNew.next = p1;
    			pNew = pNew.next;
    			p1 = p1.next;
    		}else{
    			pNew.next = p2;
    			pNew = pNew.next;
    			p2 = p2.next;
    		}
    	}
    	
    	if(p1 == null){
    		pNew.next = p2;
    	}
    	if(p2 == null){
    		pNew.next = p1;
    	}
    	
    	return pHead;
    }
}