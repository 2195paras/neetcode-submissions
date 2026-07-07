class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

    int sc[]= new int[26];
    int wc[]= new int[26];

if(s1.length()>s2.length())return false;

    for (char x : s1.toCharArray()) {
     sc[x-'a']=sc[x-'a']+1;

    }

    for (int i=0;i<s1.length();i++) {
      wc[s2.charAt(i)-'a']=wc[s2.charAt(i)-'a']+1;
    }

if(isMatched(sc,wc)){
return true;}

for(int i=1;i<=s2.length()-s1.length();i++)
{
  wc[s2.charAt(i-1)-'a']--;
 wc[s2.charAt(i+s1.length()-1)-'a']++;

  if(isMatched(sc,wc)){
    return true;
}


}
return false;
  }

 

    private static boolean isMatched(int[] m1, int[] m2){

    for(int i=0;i<26;i++){
      if(m1[i]!=m2[i]){
        return false;
      }
    }
return true;
    }}