class Solution {
    public int trap(int[] height) {
          int maxLeft[] = new int[height.length];
    int maxRight[] = new int[height.length];

    int min = 0;
    for (int i=0;i<height.length;i++) {

      maxLeft[i] = min;

      if (min < height[i]) {
        min = height[i];
      }

    }
    min = 0;

    for (int i = height.length - 1; i >= 0; i--) {
      maxRight[i] = min;

      if (min < height[i]) {
        min = height[i];
      }
    }

    int ans=0;

    for (int i=0;i<height.length;i++) {
      System.out.println("Area at index  "+  height[i] + " ( "+maxLeft[i]+" - "+maxRight[i] +" )" + (Math.min(maxLeft[i],maxRight[i]) - height[i]));
      ans =  ans + ((Math.min(maxLeft[i],maxRight[i]) - height[i])>0 ? (Math.min(maxLeft[i],maxRight[i]) - height[i]):0);

    }

    return ans;
  }
}
