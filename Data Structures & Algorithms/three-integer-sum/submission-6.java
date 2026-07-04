class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>  ans = new ArrayList<>();
Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    //-4,-1,-1,0,1,2

    for(int i=0;i<nums.length;i++){

      if(i>0&& nums[i-1]==nums[i]){
        continue;
      }

int j=i+1;
int k= nums.length-1;
      while(j<k){
     //   System.out.println("compare  "+nums[j]+" + "+nums[k] + "=  -"+nums[i]);
        if(nums[j]+nums[k]==-nums[i]){
          ans.add(Arrays.asList(nums[i], nums[j],nums[k]));
          j++;
          k--;

          while (j < k && nums[j] == nums[j - 1]) j++;
          while (j < k && nums[k] == nums[k + 1]) k--;

        }else if(nums[j]+nums[k]>-nums[i]){
          k--;
      }else{
          j++;
        }
      }
    }
return ans;
  }
}
