import java.util.ArrayList;
public class Solution {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> re = new ArrayList<Integer>();
		if(array.length==0 || array==null){
        	return re;
        }
		int m = 0;
		int n = array.length - 1;
		while(m<n){
			int curSum = array[m] + array[n];
			if(curSum == sum){
				re.add(array[m]);
				re.add(array[n]);
				System.out.println(array[m]);
				System.out.println(array[n]);
				break;
			}else if(curSum>sum){
				n--;
			}else{
				m++;
			}
		}
		return re;
    }
}