public class Solution {
    public int GetUglyNumber_Solution(int index) {
    	if(index<=0){
    		return 0;
    	}
    	int[] Ugly = new int[index];
    	Ugly[0] = 1;
    	int next = 1;
    	int idx2 = 0;
    	int idx3 = 0;
    	int idx5 = 0;
    	while(next<index){
    		int ugly = min3(Ugly[idx2]*2, Ugly[idx3]*3,Ugly[idx5]*5);
    		Ugly[next] = ugly;
    		while(Ugly[idx2]*2<=Ugly[next]){
    			idx2++;
    		}
    		while(Ugly[idx3]*3<=Ugly[next]){
    			idx3++;
    		}
    		while(Ugly[idx5]*5<=Ugly[next]){
    			idx5++;
    		}
    		next++;
    	}
    	return Ugly[index-1];
    }
    public static int min3(int a,int b,int c){
    	int min = (a<b)?a:b;
    	min = (min<c)?min:c;
    	return min;
    }
}