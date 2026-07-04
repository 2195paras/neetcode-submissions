class Solution {
     public static int maxArea(int[] heights) {

    int ans =0;
    int i=0;
    int j=heights.length-1;
    while(i<j){

      int t=Math.min(heights[i],heights[j])*(j-i);
      if(t>ans){
        ans=t;
      }

      if(heights[i]>heights[j]){
j--;
      }else {
i++;
      }
    }

return ans;
  }
}
