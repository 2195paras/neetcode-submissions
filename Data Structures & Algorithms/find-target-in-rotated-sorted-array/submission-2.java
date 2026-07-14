class Solution {
    public int search(int[] nums, int target) {
  
    int i = 0;
    int r = nums.length - 1;
    int m = 0;

    while (i < r) {

      m = i + (r - i) / 2;
      System.out.println("i - " + nums[i] + "  r - " + nums[r] + "  m - " + nums[m]);

      if(nums[m] == target){
        return m;
      }

      if (nums[i] <= nums[m]){
        if (nums[i]<= target && target<=nums[m]){
          r=m;
        } else {
          i = m + 1;
        }
      }else{
        if (nums[m]<= target && target<=nums[r]){
          i=m+1;
        } else {
          r = m;
        }
      }
    }

    if (target == nums[r]) {
      return r;
    } else {
      return -1;
    }
  }
}

