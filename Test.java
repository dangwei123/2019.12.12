编写一个程序，找出第 n 个丑数。

丑数就是只包含质因数 2, 3, 5 的正整数。
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int p2=0;
        int p3=0;
        int p5=0;
        for(int i=1;i<n;i++){
            dp[i]=Math.min(dp[p2]*2,Math.min(dp[p3]*3,dp[p5]*5));
            if(dp[i]==dp[p2]*2)  p2++;
            if(dp[i]==dp[p3]*3)  p3++;
            if(dp[i]==dp[p5]*5)  p5++;
        }
        return dp[n-1];
    }
}