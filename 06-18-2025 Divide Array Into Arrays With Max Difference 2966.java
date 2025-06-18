//Problem link - https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/?envType=daily-question&envId=2025-06-18

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        int a = 0;
        for(int i = 0;i<n-2;i+=3)
        {
            if(nums[i+1]-nums[i]<=k 
            && nums[i+2]-nums[i]<=k
            && nums[i+2]-nums[i+1]<=k)
            {
                ans[a][0] = nums[i];
                ans[a][1] = nums[i+1];
                ans[a][2] = nums[i+2];
                a++;
            }
            else
            return new int[0][0];
        }
        return ans;
    }
}
