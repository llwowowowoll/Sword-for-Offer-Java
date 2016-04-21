public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
    	if(len==0){
        	return 0;
        }
    	int curSum = 0;
    	int maxSum = array[0];
    	for(int i = 0;i<len;i++){
    		if(curSum<=0){
    			curSum = array[i];
    		}
    		else{
    			curSum += array[i];
    		}
    		if(curSum>maxSum){
    			maxSum = curSum;
    		}
    	}   
    return maxSum;
    }
}