class Solution459
{
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length(), i=0, j=0;
        
        for(i=len/2; i>=1; i--)
        {
            if(len % i == 0)
            {
                int m = len/i;
                String subStr = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(j=0; j<m; j++)
                    sb.append(subStr);

                if(sb.toString().equals(s)) return true;
            }
        }

        return false;   
    }
}

public class E459_RepeatedSubstringPattern {
    public static void main(String[] args) {
        Solution459 ob = new Solution459();
        System.out.println(ob.repeatedSubstringPattern("abab"));;
    }
}
