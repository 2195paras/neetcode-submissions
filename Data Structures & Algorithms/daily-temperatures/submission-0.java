class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //[30,38,30,36,35,40,28]
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {
      //System.out.println("Checking :: "+temperatures[i]);
      while (!st.isEmpty() &&
          temperatures[i] > temperatures[st.peek()]) {

        int index = st.pop();
        ans[index] = i - index;
      }

      st.push(i);
    }

    return ans;
  }
}
