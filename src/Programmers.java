import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int[] num = new int[(int)Math.log10(n)+1];
        int index = 0;
        while(n!=0) {
            num[index++] = (int)(n%10);
            n/=10;
        }
        
        return num;
    }
}

public class Programmers {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(1321564135)));
    }
}