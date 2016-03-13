public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str==null)
        {
            return null;
        }
        StringBuffer New_str=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)==' ')
            {
                New_str.append('%');
				New_str.append('2');
				New_str.append('0');
            }
            else
            {
            	New_str.append(str.charAt(i));	    
            }
           
        }
        return New_str.toString();    
    }
}