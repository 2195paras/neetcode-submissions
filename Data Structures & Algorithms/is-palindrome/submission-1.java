class Solution {
    public boolean isPalindrome(String s) {
          s=s.replaceAll("\\s+", "");
      char c[] = s.toCharArray();
    int i = 0;
    int j = c.length - 1;
    while (i < j) {

      if (!Character.isLetterOrDigit(c[i])) {
        i++;
      }
      if (!Character.isLetterOrDigit(c[j])) {
        j--;
        continue;
      }
      if (Character.toLowerCase(c[i]) != Character.toLowerCase(c[j])) {
        return false;
      }else{
        i++; j--;
      }
    }
    return true;
  }
}
