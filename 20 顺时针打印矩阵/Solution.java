import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int rows = matrix.length;
    	int columns = matrix[0].length;
    	int start = 0;
    	while(rows>start*2 && columns>start*2){
            ArrayList<Integer> result1 = new ArrayList<Integer>();
            result1 = print(matrix,start);
    		for(int j=0;j<result1.size();j++){
    			result.add(result1.get(j));
    		}
    		start++;
    	}
        System.out.print(result);
    	return result;
    }
    
    
    public ArrayList<Integer> print(int [][] matrix,int start){
    		int endX = matrix[0].length-start-1;
    		int endY = matrix.length-start-1;
    		ArrayList<Integer> result = new ArrayList<Integer>();
    		for(int i=start;i<=endX;i++){
    			result.add(matrix[start][i]);
    		}
    		if(start<endY){
    			for(int i=start+1;i<=endY;i++){
        			result.add(matrix[i][endX]);
        		}
    		}
    		if(start<endX && start<endY){
    			for(int i=endX-1;i>=start;i--){
        			result.add(matrix[endY][i]);
        		}
    		}
    		if(start<endX && start<endY-1){
    			for(int i=endY-1;i>start;i--){
        			result.add(matrix[i][start]);
        		}
    		}
    		return result;
    }
    
}