class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }

        Integer[] temp = new Integer[n];
        for(int i=0; i<n; i++){
            temp[i] = nums[i];
        }

        Arrays.sort(temp, (a,b)->{
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA != freqB){
                return freqA - freqB;
            }else{
                return b - a;
            }
        });

        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
        return nums;

    }
}