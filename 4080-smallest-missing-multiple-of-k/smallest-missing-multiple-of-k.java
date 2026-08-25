class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int i=k; ; i=i+k){
            if(!set.contains(i)){
                if(i % k == 0)
                    return i;
            }
        }
    }
}