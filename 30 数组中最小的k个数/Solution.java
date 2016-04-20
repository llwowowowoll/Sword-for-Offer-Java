import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	 ArrayList<Integer> List = new ArrayList<Integer>();
    	 if(input.length==0 || k>input.length || k<1){
    		 return List;
    	 }
    	 int index = SmaN(input,0,input.length-1,k);
    	 for(int i= index;i<input.length;i++){
    		 List.add(input[i]);
    	 }
    	 return List;
    }
    public static int SmaN(int[] m, int front, int rear, int N){
	    int mid = 0, temp = 0;
	    while(front <= rear){
	        mid  = partition(m, front, rear);
	        temp = rear - mid + 1;                // mid以右（包括mid）有temp个数
	        if (temp == N)                    // 收工
	            break;
	        else if (temp > N)                // 在右边找N个数
	            front = mid + 1;
	        else                        // 在左边找N-temp个数
	        {
	            rear = mid - 1;
	            N -= temp;
	        }
	    }
	    return mid;
	}
	public static int partition(int[] a, int low, int high){
		int temp = a[low];
		while(low<high){
			while(low<high && a[high]<=temp){
				high--;
			}
			a[low] = a[high];
			while(low<high && a[low]>=temp){
				low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return low;
	}
}