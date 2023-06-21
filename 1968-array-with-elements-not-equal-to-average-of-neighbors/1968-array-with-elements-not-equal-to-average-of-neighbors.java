class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];

        Arrays.sort(nums);

        int i = 0, j = nums.length / 2;

        for (int idx = 0; idx < nums.length; idx++) {
            if (idx % 2 == 0) {
                answer[idx] = nums[j++];
            } else {
                answer[idx] = nums[i++];
            }
        }

        return answer;
    }
}