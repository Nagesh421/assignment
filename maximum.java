public class Code {
	public static int maxSubArraySum(int[] a){
		int n=a.length;
		int maxSum=Integer.MIN_VALUE;
		for (int i=0; i <=n-1; i++){
			int Sum=0;
			for(int j=i;j<=n-1;j++){
				Sum=Sum+a[j];
				if(Sum>maxSum){
					maxSum=Sum;
				}
			}
		}
		return maxSum;
            }
	public static void main(String[] args){
		{
			int [] a1={-5,-7,-9,1,2,3,4};
			System.out.println(maxSubArraySum(a1));
		}
	}
}
