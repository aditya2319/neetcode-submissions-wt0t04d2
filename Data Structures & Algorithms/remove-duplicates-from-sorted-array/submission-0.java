class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for(int r = 1; r < nums.length; r++){
            if(nums[r] != nums[r-1]){
                nums[left] = nums[r];
                left += 1;
            }
        }
        return left;
        
    }
}