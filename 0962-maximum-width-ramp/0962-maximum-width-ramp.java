class Solution {
    public int maxWidthRamp(int[] nums) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<nums.length; i++){
            if(stack.isEmpty() || nums[i] < nums[stack.peek()])
                stack.push(i);
        }

        for(int i=nums.length-1; i>=0; i--){

            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]){
                answer = Math.max(answer, i - stack.pop());
            }
        }
        
        return answer;
    }


}