class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] temp = new int[n1+n2];
        int i=0, j=0, k=0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                temp[k++] = nums1[i++];
            }else{
                temp[k++] = nums2[j++];
            }
        }
        while(i<n1){
            temp[k++] = nums1[i++];
        }
        while(j<n2){
            temp[k++] = nums2[j++];
        }
        
        int len = temp.length;
        double ans = 0;
        if(len % 2 ==0){
            ans = (temp[len /2] + temp[(len /2) -1])/2.0;
        }else{
            ans = temp[len / 2];
        }
        return ans;
    }
}