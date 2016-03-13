import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array){
		if (array==null||array.length==0){
			return 0;
		}
		int leftIndex=0;
		int rightIndex=array.length-1;
		int mid=leftIndex;
		while(array[leftIndex]>=array[rightIndex]){
			if(rightIndex-leftIndex==1){
				mid=rightIndex;
				break;
			}
			mid=(leftIndex+rightIndex)/2;
			if (array[leftIndex]==array[rightIndex] && array[leftIndex]==array[mid]){
				int min=array[leftIndex];
				for(int i=leftIndex+1;i<=rightIndex;i++){
					if(array[i]<min){
						min=array[i];
					}
				}
				return min;
			}
			if(array[leftIndex]<=array[mid]){
				leftIndex=mid;
			}else if(array[mid]<=array[rightIndex]){
				rightIndex=mid;
			}
		}
		return array[mid];
    }
}