class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
    int i=0;
    int j=numbers.length-1;

   while (i<j){
      if(numbers[i]+numbers[j]==target){

        int ans[]={i+1,j+1};
        return ans;
      }
     

      if(numbers[i]+numbers[j]>target){
        j--;
      }else if(numbers[i]+numbers[j]<target){
      i++;
    }

  }

    return numbers;
    }
}
