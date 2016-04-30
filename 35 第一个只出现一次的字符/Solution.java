import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str==null){
        	return 0;
        }
        HashMap <Character, Integer> Map = new HashMap <Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Map.containsKey(ch)) {
                Map.put(ch, 1);
            }
            else{
                Integer in = Map.get(ch) + 1;
                Map.put(ch, in);
            }  
        }
        int first = -1;
        for(int i=0;i<str.length();i++){
            Character key = str.charAt(i);
                if(Map.get(key)==1){
                	first = i;
                	break;
                }     
        }
        return first;
    }
}