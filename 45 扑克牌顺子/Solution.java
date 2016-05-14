import java.util.*;

public class Solution {
    public boolean isContinuous(int [] numbers) {
    	if(numbers.length!=5){
    		return false;
    	}
    	boolean isContinuous = false;
    	Arrays.sort(numbers);
    	int num_zero = 0;
    	int num_gap = 0;
    	for(int i = 0;i<numbers.length-1;i++){
    		if(numbers[i]==0){
    			num_zero++;
    		}
    	}
    	for(int i = num_zero;i<numbers.length-1;i++){
    		if(numbers[i+1] - numbers[i] > 1){
    			num_gap += numbers[i+1] - numbers[i] - 1;
    		}else if(numbers[i+1] == numbers[i]){
    			return false;
    		}
    	}
    	if(num_zero >= num_gap){
    		isContinuous = true;
    	}
    	return isContinuous;
    }
}