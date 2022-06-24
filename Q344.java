import java.util.Arrays;

public class Q344 {
    public static void main(String[] args){
        Solution344 test = new Solution344();
        char[] s = {'A','B','D','1','Z'};
        System.out.print(Arrays.toString(test.reverseString(s)));
    }
}


class Solution344 {
    public char[] reverseString(char[] s) {
        for(int i = 0; i< s.length/2 ; i++){
            char temp;
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length -i - 1] = temp;        
        }
        return s;
    }
}