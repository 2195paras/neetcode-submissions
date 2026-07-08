class Solution {
    public int evalRPN(String[] tokens) {
           int ans = 0;
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < tokens.length; i++) {
      System.out.println("Checking   :: "+tokens[i] );
      if (!tokens[i].equals("+") && !tokens[i].equals("*") && !tokens[i].equals("-") && !tokens[i].equals("/")) {
st.push(Integer.valueOf(tokens[i]));
      }else{
    int x = st.pop();
    int y=st.pop();
    if(tokens[i].equals("+")){
      st.push(x+y);
    }
        if(tokens[i].equals("-")){
          st.push(y-x);
        }
        if(tokens[i].equals("*")){
          st.push(x*y);
        }
        if(tokens[i].equals("/")){
          st.push(y/x);
        }
      }
    }
ans=st.pop();
    return ans;
  }
    
}
