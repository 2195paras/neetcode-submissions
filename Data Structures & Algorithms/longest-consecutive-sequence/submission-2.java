class Solution {
    public int longestConsecutive(int[] nums) {
    
       HashSet<Integer> s= new HashSet<>();
    for(int i:nums){
      s.add(i);
    }
    int c=0;
    int i=0;
    int ans=0;
if(nums.length==0)
  return 0;
//2,20,4,10,3,4,5}
    boolean checkNext=true;
    int checkNextVal = nums[i];
   while(i<nums.length){


      if(s.contains(checkNextVal)){
        c++;
        checkNextVal=checkNextVal+1;

      }else{
        i++;
       if(i<nums.length) {

         checkNextVal = nums[i];
       }
        if(c>ans){
          ans=c;

        }
        c=0;
      }
    }

return ans;
  }
}
