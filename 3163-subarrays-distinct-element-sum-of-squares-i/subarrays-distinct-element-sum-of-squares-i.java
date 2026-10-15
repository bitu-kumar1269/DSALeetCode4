class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for(int i=0;i<nums.size();i++){
        Set<Integer> map = new HashSet<>();
            for(int j = i; j< nums.size();j++){
                if(!map.contains(nums.get(j))){
                    map.add(nums.get(j));
                }
                ans += map.size() * map.size();
                // System.out.println(ans);
            }
        }
        return ans;
    }
}