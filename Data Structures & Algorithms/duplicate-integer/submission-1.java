class Solution {
    public  boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> hm= new HashMap<>();

        for(int i : nums){
          if(!hm.containsKey(i)){
hm.put(i,i);
          }else{
            return true;
          }
        }
return false;
  }
}