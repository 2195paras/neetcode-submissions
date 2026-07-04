class Solution {
    public int maxProfit(int[] prices) {
   
    int i=0;
    int j=1;
    int ans=0;
while(i<prices.length-1){
  System.out.println("Compare :: "+ prices[i]+" "+prices[j]);
  if(prices[i]<prices[j]){
    int t= prices[j]-prices[i];
    if(t>ans){
      ans=t;
      System.out.println("ans :: "+ ans);

    }
    j++;
  }
  else{
      i=j;
      j=i+1;
    }
if(j==prices.length){
  i++;
  j=i+1;
  continue;
}
}
    return ans;
  }
}
