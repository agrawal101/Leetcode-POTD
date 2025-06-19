// Problem link - https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/description/?envType=daily-question&envId=2025-06-19

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 1;
        int max = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]-max>k){
                cnt++;
                max = nums[i];
            }
        }
        return cnt;
    }
}
