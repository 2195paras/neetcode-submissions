class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    

    int smaller[] = nums1.length > nums2.length ? nums2 : nums1;
    int bigger[] = nums1.length > nums2.length ? nums1 : nums2;
    int total = smaller.length + bigger.length;
    int half = total % 2 == 0 ? total / 2 : total / 2 + 1;
    double ans = 0;

    int l = 0;
    int r = smaller.length;

    while (l <= r) {

      int m = l + (r - l) / 2;
     // int l1 = m >= 0 ? smaller[m] : Integer.MIN_VALUE;
     // int l2 = half - m - 1 > 0 ? bigger[half - m - 1] : Integer.MIN_VALUE;
    //  int r1 = m + 1 < smaller.length ? smaller[m + 1] : Integer.MAX_VALUE;
    //  int r2 = half - m < bigger.length ? bigger[half - m] : Integer.MAX_VALUE;

      int partitionSmaller =  l + (r - l) / 2;
      int partitionBigger = half - partitionSmaller;

      int l1 = (partitionSmaller == 0)
          ? Integer.MIN_VALUE
          : smaller[partitionSmaller - 1];

      int l2 = (partitionSmaller == smaller.length)
          ? Integer.MAX_VALUE
          : smaller[partitionSmaller];

      int r1 = (partitionBigger == 0)
          ? Integer.MIN_VALUE
          : bigger[partitionBigger - 1];

      int r2 = (partitionBigger == bigger.length)
          ? Integer.MAX_VALUE
          : bigger[partitionBigger];


      if (l1 <= r2 && r1 <= l2) {

        if (total % 2 == 0) {
          return (Math.max(l1, r1) + Math.min(l2, r2)) / 2.0;
        } else {
          return Math.max(l1, r1);
        }
      }

      if (l1 > r2) {
        r = partitionSmaller - 1;
      } else {
        l = partitionSmaller + 1;
      }
    }

    return 0;
  }
}
