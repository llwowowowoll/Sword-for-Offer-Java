import java.lang.math.*;
public class Solution {
    public double Power(double base, int exponent) {
        double result=1.0;
		if(exponent==0){
			return 1.0;
		}
		if(exponent>0){
			result=PowerMax(base,exponent);
		}
		if(exponent<0){
			result=PowerMax(base,abs(exponent));
			result=1.0/result;
		}
		return result;
  }
  public static double PowerMax(double base, int exponent){
	  double result=1.0;
	  for(int i=0;i<exponent;i++){
		  result=result*base;
	  }
	  return result;
  }
}