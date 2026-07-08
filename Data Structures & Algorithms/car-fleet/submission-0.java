class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Integer[] indices = new Integer[position.length];

    for (int i = 0; i < position.length; i++) {
      indices[i] = i;
    }
    Stack<Double>st= new Stack<>();

    Arrays.sort(indices, (a, b) -> Integer.compare(position[b], position[a]));

   /* for(int i=indices.length-1;i>=0;i--){
      st.push(indices[i]);
    }*/

int fleet=0;

    for(int i=0;i<indices.length;i++){
      double  x=(double) (target-position[indices[i]])/speed[indices[i]];

      if(st.isEmpty()){
st.push(x);
      }else{

        double stValTime=st.peek();
      if(x>stValTime){
        st.push(x);
      }else{
        fleet++;
      }

      }
      }

    return st.size();
  } 
    }

                     