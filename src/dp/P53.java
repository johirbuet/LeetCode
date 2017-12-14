package dp;
/**
 * {@link ttps://leetcode.com/problems/maximum-subarray}
 * @author johir
 *
 */
public class P53 {	
	// In this case the maximum sum can be begative if all the numbers are negative in the array
	public int maxsubarraysum(int [] nums) {
		int max = 0;
		// This DP will be used to keep track of different max ending here
		int [] dp = new int[nums.length];
		dp[0] = nums[0];
		max = dp[0];
		for(int i=1;i<nums.length;i++) {
			dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
			max = Math.max(dp[i], max);
		}
		return max;
	}
}
