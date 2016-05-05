//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null || array.length<2){
        	return;
        }
        int Result = 0;
        for(int i = 0;i < array.length;i++){
        	Result = Result ^ array[i];
        }
        int index1 = FindFirst1(Result);
        for(int j = 0;j < array.length;j++){
        	if(Is1Index1(array[j],index1)){
        		num1[0]^=array[j];
        	}else{
        		num2[0]^=array[j];
        	}
        }
    }
    public int FindFirst1(int a){
    	int Index = 0;
    	while((a & 1)==0){
    		a = a>>1;
        	Index++;
    	}
    	return Index;
    }
    boolean Is1Index1(int a,int index1){
    	a = a>>index1;
    	return (a & 1)==1;
    }
}