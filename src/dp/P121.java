package dp;

public class P121 {
	
	public int maxProfit(int [] p) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<p.length;i++) {
			min = Math.min(min, p[i]);
			max  =  Math.max(max,p[i] - min);
		}
		return max;
	}
}
