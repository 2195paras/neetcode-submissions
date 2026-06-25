class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

    for (int i : nums) {
      if (hm.containsKey(i)) {
        hm.put(i,hm.get(i) + 1);
      } else {
        hm.put( i,1);
      }
    }

    int[] ans = hm.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();

    return ans;
    }}

