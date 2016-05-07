import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
      ArrayList<ArrayList<Integer>> re = new ArrayList<>(); 
      int low = 1;
      int high = 2;
      int currSum = low + high;
      while (low < (sum+1) / 2) {
          if (currSum == sum) {
              ArrayList<Integer> list = new ArrayList<>();
              for (int i = low; i <= high; i++) {
                  list.add(i);
              }
              re.add(list);
              currSum -= low;
              low++;
          } else if (currSum > sum){
              currSum -= low;
              low++;
          } else {
              high++;
              currSum += high;
          }
      }
      return re;
	}
}