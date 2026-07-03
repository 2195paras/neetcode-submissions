class Solution {

      public static String encode(List<String> strs) {
    StringBuilder s = new StringBuilder();
    for (String st : strs) {
      s.append(st.length() + "#" + st);
    }

    return s.toString();

  }

  /* public static String encode(List<String> strs) {
 StringBuilder s= new StringBuilder();
 //Hello", "World
     //2,1,5,6,11-HelloWorld

    //s.append(strs.size());



 int i=1;
     for(String st:strs){
       s.append(","+i+"," +(i+st.length()));
       i=i+st.length();
        }

     s.append("-");
     String temp= ""+s.length();
 s.insert(0,temp.length()+s.length());
     //s.insert(0,s.length());

 String s1= s.toString().substring(0,s.length()-1);

     for(String st:strs){
       s.append(st);
     }

     String s2= s.toString().substring(s1.length(),s.length());

     System.out.println(s.toString());

     return s.toString();
   }
 //2,1,6,6,11-HelloWorld

   */
  public static List<String> decode(String str) {
    List<String> ans = new ArrayList<>();
    // String[] s= str.split(",");
    int i = 0;
    int j = 0;
    StringBuilder sl = new StringBuilder();
    StringBuilder sAns = new StringBuilder();
    int l = 0;
    for (char c : str.toCharArray()) {


      if (l == 0) {

        if (c != '#') {
          sl.append(c);
        } else {
          l = Integer.parseInt(sl.toString());
          sl = new StringBuilder();

          //if(!sAns.toString().isEmpty())
            ans.add(sAns.toString());
          sAns = new StringBuilder();
        }
      } else {
        sAns.append(c);
        l--;
      }
    }

      ans.add(sAns.toString());
    ans.remove(0);
return ans;

  }
}
