public class Solution {
    public String ReverseSentence(String str) {
    	StringBuffer sb = new StringBuffer();
    	if(str==null || str.length()==0 || str.trim().length()==0){
    		return str;
    	}
    	String[] sub = str.trim().split(" ");
    	for(int i = sub.length-1;i>=0;i--){
    		sb.append(sub[i]);
    		sb.append(" ");
    	}
    	return sb.toString().trim();
    }
}