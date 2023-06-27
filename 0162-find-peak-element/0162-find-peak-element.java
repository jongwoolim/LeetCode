class Solution {
    public int findPeakElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< nums.length; i++){
            map.put(nums[i], i);
        }
        
        return map.get(Arrays.stream(nums).max().getAsInt());
    }
}