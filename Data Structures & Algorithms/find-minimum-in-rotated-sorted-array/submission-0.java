class Solution {
    public int findMin(int[] nums) {
   
    int i=0;
    int r=nums.length-1;
    int m=0;

while(i<r){

   m = i + (r-i)/2;

  if(nums[m]>nums[r]){
    i=m+1;
    System.out.println("Changed Index:: i - "+i + " r -"+r+" m - "+m);
  }else {
  r=m;
    System.out.println("r Changed Index::  i -"+i + " r- "+r+" m - "+m);
  }
}
return nums[i];
  }
}
