class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> hm = new HashMap<>();

    for (int i : nums) {
      if (hm.containsKey(i)) {
        hm.put(i, hm.get(i) + 1);
      } else {
        hm.put(i, 1);
      }
    }

    //{value->count}

    //String ans[]= new String[nums.length];
    List<Integer>[] ans = new List[nums.length+1];

       for (Map.Entry<Integer, Integer> x : hm.entrySet()) {

      if(ans[x.getValue()]==null)
      {
        ans[x.getValue()]= new ArrayList<>();
      }
      ans[x.getValue()].add(x.getKey());
       // ans[x.getValue()]=Collections.singletonList(x.getKey());
      }

    int[] finalAns = new int[k];
    int counter=0;

    for (int i = ans.length - 1; i >= 0 && counter<k; i--) {
      if (ans[i] != null && !ans[i].isEmpty()) {

        for(Integer val:ans[i]){
          finalAns[counter]=val;
          counter++;
        }
      }
    }

  /*    int[] ans = hm.entrySet()
          .stream()
          .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
          .limit(k)
          .mapToInt(Map.Entry::getKey)
          .toArray();*/

    return finalAns;

  }
    }

