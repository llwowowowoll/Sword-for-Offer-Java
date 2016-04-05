import java.util.Stack;

public class Solution {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> min = new Stack();
	
    public void push(int node) {
       s1.push(node);
       if(min.size()==0 ||node<min.peek()){
    	   min.push(node);
       }else{
    	   min.push(min.peek());
       }
    }
    
    public void pop() {
    	if(s1.size()>0 && min.size()>0){
        	s1.pop();
        	min.pop();
        }
    }
    
    
    public int top() {
        if(s1.size()>0 && min.size()>0){
        	return min.peek();
        }
		return 0;
    }
    
    public int min() {
    	if(s1.size()>0 && min.size()>0){
        	return min.peek();
        }
		return 0;
    }
}