class Solution {
    public boolean isValid(String s) {
if(s.length()==1){
  return false;
}

    Stack<Character> st = new Stack<>();
    for (char c : s.toCharArray()) {

      if (c == '{') {
        st.add(c);
      } else if (c == '[') {
        st.add(c);
      } else if (c == '(') {
        st.add(c);
      }else {
if(st.isEmpty()){
  return false;
}
        char t=st.pop();

        if(! ((c==']' && t=='[')|| (c=='}' && t=='{') || (c==')' && t=='('))){
          return false;
        }
      }
    }
if(st.isEmpty()){
  return true;
}else{
  return false;
}
  }
    }

