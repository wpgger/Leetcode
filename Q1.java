import java.util.Arrays;

class Q1{
    public static void main(String[] args) {
        Solution test = new Solution();
        int nums[] = {2,7,11,15};
        int target = 17;
        
        System.out.println(Arrays.toString(test.twoSum(nums, target)));
        
    }
}



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if (nums[i]+nums[j] == target){
    
                    result[0] = i;    
                    result[1] = j;
                    
                }
            }
        }
    return result;
    } 
}