/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        CloneNodes(pHead);
        ConnectRandom(pHead);
        return ReconnectNodes(pHead);
    }
    
    public void CloneNodes(RandomListNode pHead){
    	RandomListNode pNode = pHead;
    	while(pNode!=null){
    		RandomListNode pCloned = new RandomListNode(0);
    		pCloned.label = pNode.label;
    		pCloned.next = pNode.next;
    		pCloned.random = null;
    		pNode.next = pCloned;
    		pNode = pCloned.next;
    	}
    }
    public void ConnectRandom(RandomListNode pHead){
    	RandomListNode pNode = pHead;
    	while(pNode!=null){
    		RandomListNode pCloned = pNode.next;
    		if(pNode.random!=null){
    			pCloned.random = pNode.random.next;
    		}
    		pNode = pCloned.next;
    	}
    }
    public RandomListNode ReconnectNodes(RandomListNode pHead){
    	RandomListNode pNode = pHead;
    	RandomListNode pClonedHead = null;
    	RandomListNode pClonedNode = null;
    	
    	if(pNode!=null){
    		pClonedNode = pClonedHead = pNode.next;
    		pNode.next = pClonedNode.next;
    		pNode = pNode.next;
    	}
    	while(pNode!=null){
    		pClonedNode.next = pNode.next;
    		pClonedNode = pClonedNode.next;
    		pNode.next = pClonedNode.next;
    		pNode = pNode.next;
    	}
    	return pClonedHead;
    }
}