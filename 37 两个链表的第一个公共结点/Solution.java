public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
 		int len1 = 0;
 		int len2 = 0;
 		ListNode p1 = pHead1;
 		ListNode p2 = pHead2;
 		ListNode pCommon = null;
 		while(p1!=null){
 			p1 = p1.next;
 			len1++;
 		}
 		while(p2!=null){
 			p2 = p2.next;
 			len2++;
 		}
 		ListNode plong = pHead1;
 		ListNode pshort = pHead2;
 		int dif = (len1>=len2)?(len1-len2):(len2-len1);
 		if(len1<len2){
 			plong = pHead2;
 			pshort = pHead1;
 		}
 		for(int i=0;i<dif;i++){
 			plong = plong.next;
 		}
 		while((plong!=null)&&(pshort!=null)){
 			if(plong ==pshort){
 				pCommon = plong;
 				break;
 			}else{
 				plong = plong.next;
 	 			pshort = pshort.next;
 			}
 		}
 		return pCommon;
    }
}