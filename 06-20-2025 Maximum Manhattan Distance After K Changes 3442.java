// Problem link - https://leetcode.com/problems/maximum-manhattan-distance-after-k-changes/description/?envType=daily-question&envId=2025-06-20

class Solution {
    public int maxDistance(String s, int k) {
        int nc = 0;
        int wc = 0;
        int sc = 0;
        int ec = 0;
        int ans = 0;
        char crr[] = s.toCharArray();
        int n = s.length();
        for(int i = 0;i<n;i++)
        {
            char c = crr[i];
            if(c=='N')
            nc++;
            else if(c=='E')
            ec++;
            else if(c=='W')
            wc++;
            else
            sc++;
            int dis = Math.abs(nc-sc)+Math.abs(ec-wc);
            int loss = (i+1)-dis;
            if(loss!=0)
            {
                int x = Math.min(2*k,loss);
                dis+=x;
            }
            ans = Math.max(ans,dis);
        }
        return ans;
    }
}
