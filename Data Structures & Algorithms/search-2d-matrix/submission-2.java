class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int r =0;
    int c=matrix[0].length-1;
    for(int i=1;i<matrix.length;i++) {

      if (target == matrix[i-1][c]) {
        return true;
      } else if (target <= matrix[i - 1][c]) {
        r = i - 1;
        break;
      } else if (matrix[i - 1][c] < target && target <= matrix[i][c]) {
        r = i;
        break;
      }
    }


    int x[]=matrix[r];

    int l=0;
    int h= x.length-1;

    while(l<=h){

      int m= l+ (h-l)/2;
      if(x[m]==target){
        return true;
      }
      if(x[m]<target){
        l=m+1;
      }else {
        h= m-1;
      }

    }



    return false;
    }
}
