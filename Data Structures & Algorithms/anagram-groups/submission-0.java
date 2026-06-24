class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
      List<List<String>> ans = new ArrayList<>();
    Map<String, List<String>> hm = new HashMap<>();

    for (String s : strs) {
      char[] ts=s.toCharArray();
      Arrays.sort(ts);
      String sorted = new String(ts);

      if (hm.containsKey(sorted)) {
        List<String> t = hm.get(sorted);
        t.add(s);
      } else {

        hm.put(sorted, new ArrayList<>(Collections.singleton(s)));
      }
    }
    ans.addAll(hm.values());
    return ans;

  }}
