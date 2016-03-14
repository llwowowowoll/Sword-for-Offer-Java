public class Solution {
    public int Fibonacci(int n) {
		if(n<=0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		int One=0;
		int Two=1;
		int result=0;
        if(n>0){
			for(int i=2;i<=n;i++){
				result=One+Two;
				One=Two;
				Two=result;
			}
		}
		return result;
    }
}