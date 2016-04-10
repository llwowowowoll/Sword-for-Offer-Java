import java.util.*;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
        	return false;
        }
        int len = sequence.length-1;
        int root = sequence[len];
        
        int i=0;
        for(;i<len-1;i++){
        	if(sequence[i]>root){
        		break;
        	}
        }
        
        int j=i;
        for(;j<len-1;j++){
        	if(sequence[j]<root){
        		return false;
        	}
        }
        
        boolean left = true;
        if(i>0){
        	left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        }
        
        boolean right = true;
        if(i<len-1){
        	right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, len-1));
        }
        
        return (left&&right);
        
    }
}