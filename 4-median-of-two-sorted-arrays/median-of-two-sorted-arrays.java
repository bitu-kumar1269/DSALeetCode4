class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] temp = new int[n1+n2];
        int i=0, j=0, k=0;

        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j])
                temp[k++] = nums1[i++];
            else
                temp[k++] = nums2[j++];
        }
        
        // 2. Copy remaining elements of nums1, if any
        while(i<n1) temp[k++] = nums1[i++];
        // 3. Copy remaining elements of nums2, if any
        while(j<n2) temp[k++] = nums2[j++];
        
        // 4. Calculate Median
        int len = temp.length;
        if(len % 2 ==0){ // for even len -> (2 + 3) / 2 = 2.5.
            return (temp[len /2 -1] + temp[len /2])/2.0;
        }//else
        return temp[len / 2];
    }
}