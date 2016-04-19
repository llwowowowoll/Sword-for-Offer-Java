import java.util.*;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
    	int len = array.length;
    	HashMap <Integer, Integer> Map = new HashMap <Integer, Integer>();
    	for (int i = 0; i < len; i++) {
			if (!Map.containsKey(array[i])) {
				Map.put(array[i], 1);
			} 
			else{
				Integer in = Map.get(array[i]) + 1;
				Map.put(array[i], in);
			}	
		}
    	Iterator<Integer> it = Map.keySet().iterator();  
        while(it.hasNext()) {  
            Integer key = it.next();
            if(Map.get(key)>(len>>1)){
            	return key;
            }    
        } 
        return 0;
    }
}