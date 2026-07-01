class Solution {
    public int[] productExceptSelf(int[] nums) {
      long m = 1;
    int containsZero=0;

    for (int i = 0; i < nums.length; i++) {

      if(nums[i]!=0)
      m = m * nums[i];
      else{
        containsZero++;
      }

      if(m>Integer.MAX_VALUE){
        System.out.println(m +" Integer > "+ Integer.MAX_VALUE);
      }
      if(m>Long.MAX_VALUE){
        System.out.println(m +" Long > "+ Long.MAX_VALUE);
      }

    }


    for (int i = 0; i < nums.length; i++) {


      if(containsZero==1){
        if (nums[i] != 0) {
          nums[i]=0;
        }else{
          nums[i] = (int) (m );
        }
      }else if(containsZero>1){
         return new int[nums.length];
      }else if (nums[i] != 0) {
        nums[i] = (int) (m / nums[i]);
      }
    }
    System.out.println(nums);

    //[0,-6,0,0,0]
    return nums;
  }
    }
