class TimeMap {

  private Map<String, ArrayList<TimeValue>> map;

  public TimeMap() {
    map = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    TimeValue timeValue = new TimeValue(value, timestamp);


    if (!map.containsKey(key)) {
      ArrayList arrayList = new ArrayList();
      arrayList.add(timeValue);
      map.put(key, arrayList);
    } else {
      // map.put(key,map.getOrDefault(key,new ArrayList<>()));
      ArrayList arrayList = map.get(key);
      arrayList.add(timeValue);
      map.put(key, arrayList);
      // map.get(key).add(timeValue);
    }

  }
  //String get(String key, int timestamp) Returns a value such that set was called previously,
  // with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the
  // largest timestamp_prev.
  // If there are no values, it returns "".

    public String get(String key, int timestamp) {

        ArrayList<TimeValue> arrayList = map.get(key);

        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }

        int left = 0;
        int right = arrayList.size() - 1;

        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arrayList.get(mid).getTimestamp() <= timestamp) {

                // Valid answer
                ans = mid;

                // Try finding a larger valid timestamp
                left = mid + 1;

            } else {

                // Need smaller timestamps
                right = mid - 1;
            }
        }

        return ans == -1 ? "" : arrayList.get(ans).getValue();
    }

  class TimeValue {
    String value;
    int timestamp;

    public TimeValue(String value, int timestamp) {
      this.value = value;
      this.timestamp = timestamp;
    }

    public String getValue() {
      return value;
    }

    public int getTimestamp() {
      return timestamp;
    }

  }
}
