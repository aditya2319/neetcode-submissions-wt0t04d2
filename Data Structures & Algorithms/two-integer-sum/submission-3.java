class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        int[] results = new int[2];
        for(int i =0; i < nums.length; i++){
            for(int j =1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    results[0] = i;
                    results[1] = j;
                    return results;
                }
            }
        }return results;
        
    }
}
