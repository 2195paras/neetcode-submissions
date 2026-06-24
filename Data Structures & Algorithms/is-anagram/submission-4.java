class Solution {
    public boolean isAnagram(String s, String t) {

       Map<Character,Integer> hm = new HashMap<>();
    Map<Character,Integer> hm2 = new HashMap<>();

    if (s.length() != t.length()) {
      return false;
    }

      for (char ch : s.toCharArray()) {
        if (hm.containsKey(ch)) {
          hm.put(ch, hm.get(ch) + 1);
        } else {
          hm.put(ch, 1);
        }

      }

      for (char ch : t.toCharArray()) {
        if (hm2.containsKey(ch)) {
          hm2.put(ch, hm2.get(ch) + 1);
        } else {
          hm2.put(ch, 1);
        }
      }

    for (char ch : t.toCharArray()) {

           if( ( !hm2.get(ch).equals(hm.get(ch)!=null?hm.get(ch):0))){
        return false;
      }
    }

    return true;
  }
  }