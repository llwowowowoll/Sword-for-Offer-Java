public class Solution {
    public int GetNumberOfK(int [] array , int k) {
    	int num = 0;
    	if(array!=null && array.length!=0){
    		int First = GetFirstK(array,k,0,array.length-1);
        	int Last= GetLastK(array,k,0,array.length-1);
        	if(First>-1 && Last>-1){
        		num = Last - First + 1;
        	}
    	}
    	return num;
    }
    public int GetFirstK(int[] a,int k,int start,int end) {
	    if(start > end){
	    	return -1;
	    }
    	int index = (start + end)/2;
	    int mid = a[index];
	    if(mid == k){
	    	if((index>0 && a[index-1]!=k)||index==0){
	    		return index;
	    	}else{
	    		end = index - 1;
	    	}
	    }
	    else if(mid > k){
	    	end = index - 1;
	    }else{
	    	start = index + 1;
	    }
	    return GetFirstK(a,k,start,end);
    }
    public int GetLastK(int[] a,int k,int start,int end) {
    	if(start > end){
	    	return -1;
	    }
    	int index = (start + end)/2;
	    int mid = a[index];
	    if(mid == k){
	    	if((index<a.length-1 && a[index+1]!=k)||index==a.length-1){
	    		return index;
	    	}else{
	    		start = index + 1;
	    	}
	    }
	    else if(mid > k){
	    	end = index - 1;
	    }else{
	    	start = index + 1;
	    }
	    return GetLastK(a,k,start,end);
    }
}