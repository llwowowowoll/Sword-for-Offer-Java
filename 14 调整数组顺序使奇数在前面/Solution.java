import java.util.ArrayList;

public class Solution {
    public void reOrderArray(int [] array) {
		ArrayList A=new ArrayList();
		int len=array.length;
		for(int i=0;i<len;i++){
			if(array[i]%2==1){
				A.add(array[i]);
			}
		}
		for(int i=0;i<len;i++){
			if(array[i]%2==0){
				A.add(array[i]);
			}
		}
		for(int j=0;j<A.size();j++){
			array[j]=(int)A.get(j);
		}
	}
}
