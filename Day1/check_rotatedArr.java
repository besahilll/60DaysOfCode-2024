//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]>nums[i+1]){
            count++;
           }
        }

        if(nums[0]<nums[nums.length-1]){
            count++;
        }
        return count<=1;
    }
}