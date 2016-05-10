public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null || str.length() == 0 || n<=0){
        	return str;
        }
        if(n>str.length()){
        	n %= str.length();
        }
    	StringBuffer sb = new StringBuffer(str);
    	for(int i = 0;i < n;i++){
        	sb.append(str.charAt(i));
        }
        sb.delete(0, n);
        return sb.toString();
    }
}