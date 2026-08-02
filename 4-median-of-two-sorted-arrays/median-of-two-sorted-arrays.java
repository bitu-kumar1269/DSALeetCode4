class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;
        int[] temp = new int[n+m];
        int k = 0;
        for(int i=0; i<n; i++){
            temp[k++]=nums1[i];
        }
        for(int i=0; i<m; i++){
            temp[k++] = nums2[i];
        }
        Arrays.sort(temp);
        int totalLength = temp.length;
        if (totalLength % 2 == 0) {
            return (temp[totalLength / 2 - 1] + temp[totalLength / 2]) / 2.0;
        } else {
            // If odd, return the middle element
            return temp[totalLength / 2];
        }
    }
}