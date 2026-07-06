class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    char[] c = s.toCharArray();
    int ans = 0;
    int l = 0;
    int i=0;
    if(c.length==1)return 1;

   Set<Character> hm = new HashSet<>();

   for(int r=0;r<c.length;r++){

     while(hm.contains(c[r])){
       hm.remove(c[l]);
       l++;


     }
hm.add(c[r]);
     ans= ans>r-l?ans:r-l+1;


   }


    return ans;

  }
}
