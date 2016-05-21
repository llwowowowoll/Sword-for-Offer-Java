public class Solution {
    public int Sum_Solution(int n) {
    	n = (int)(Math.pow(n,2)+n)>>1;
        return n; 
    }
}