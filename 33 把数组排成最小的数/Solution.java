import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
    	int len = numbers.length;
    	StringBuffer s = new StringBuffer();
    	String[] str = new String[len];
    	for(int i = 0; i < len; i++){
            str[i] = String.valueOf(numbers[i]);
        }
    	Arrays.sort(str,new Comparator<String>(){
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
    	for(int i = 0; i < len; i++){
            s.append(str[i]);
        }
        return s.toString();
    }
}