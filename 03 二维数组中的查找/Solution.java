public class Solution {
    public boolean Find(int [][] array,int target) {
		boolean exist=false;
        int rows=array.length;
        int columns=array[0].length;
        int row=0;
        int column=columns-1;
        if (array==null)
        {
            return false;
        }
        
            while((row<rows)&&(column>=0))
        	{
            	if(target==array[row][column])
                {	
                    exist=true;
                 	break;
                }
                
            	if(target>array[row][column])
                {
                    row++;
                }
        		else 
                {
                    column--;
                }
        	}
        return exist;
         
    }
}