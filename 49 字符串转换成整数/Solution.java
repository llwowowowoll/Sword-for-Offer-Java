public class Solution {
    public int StrToInt(String str) {
    	if (str==null || str.length() == 0)
            return 0;
        int fuhao = 0;
        if (str.charAt(0) == '-')
            fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < str.length(); i++)
        {
            if (str.charAt(i) == '+')
                continue;
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return 0;
            sum = sum * 10 + str.charAt(i) - '0';
        }
        return fuhao == 0 ? sum : sum * -1;
    }
}