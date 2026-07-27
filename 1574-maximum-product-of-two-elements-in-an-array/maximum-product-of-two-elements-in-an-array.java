class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums){
            minHeap.offer(num);// add all array element into heap
            if(minHeap.size() > 2){
                minHeap.poll(); // remove all smallest elements
            }
        }
        int max1 = minHeap.poll();
        int max2 = minHeap.poll();

        return (max1-1) * (max2-1);
    }
}