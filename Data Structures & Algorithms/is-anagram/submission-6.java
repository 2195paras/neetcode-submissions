class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> hm = new HashMap<>();

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
      if (hm.containsKey(ch)  ) {
        if(hm.get(ch)==1){
        hm.remove(ch);}
              else{
        hm.put(ch, hm.get(ch) - 1);
      }
    }}

      if(hm.isEmpty()){
        return true;
      }else{
        return false;
      }

  }}