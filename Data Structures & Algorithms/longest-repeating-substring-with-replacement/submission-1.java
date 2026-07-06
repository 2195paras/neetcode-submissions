class Solution {
    public int characterReplacement(String s, int k) {
         int ans = 0;
    char c[] = s.toCharArray();
    int mf = 0;
    int l = 0;
    HashMap<Character, Integer> hm = new HashMap<>();

    for (int r = 0; r < c.length; r++) {

      System.out.println("Checking :: " + c[l]);
      if (hm.containsKey(c[r])) {
        hm.put(c[r], (hm.get(c[r]) + 1));
        mf = mf > hm.get(c[r]) ? mf : hm.get(c[r]);
      } else {
        hm.put(c[r], (1));
         mf = mf > hm.get(c[r]) ? mf : hm.get(c[r]);
      }
      System.out.println("values  r :: " + r + " l :: " + l + " mf :: " + mf + " replaced :: " +((r - l+1) - mf));

      if ((r - l+1) - mf > k) {
        System.out.println("Removing :: " + c[l]);
        hm.put(c[l], hm.get(c[l]) - 1);
        l++;
      }
      ans = ans > (r - l+1)  ? ans : (r - l+1) ;
      System.out.println("ans :: " +ans);
    }
    return ans;
    }
}
