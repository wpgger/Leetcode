// Palindrome Number

class Q9{
    public static void main(String[] args) {
        Solution9 test = new Solution9();
        boolean result = test.isPalindrome(121);
        System.out.println(result);
    }
}




class Solution9 {
    public boolean isPalindrome(int x) {
        char[] xchar = Integer.toString(x).toCharArray();
        for(int i = 0; i < xchar.length/2;i++){
            if(xchar[i] != xchar[xchar.length-1-i]){
                return false;
            }
        }
        return true;
    }
}