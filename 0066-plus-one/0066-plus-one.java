class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        
        for(int i = n; i>=0; i--){
            
            if(digits[i] < 9){
                digits[i]++;
                
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] answer = new int[n+2];
        
        System.arraycopy(digits, 0, answer, 1, n + 1);
        answer[0] = 1;
        
        return answer;
    }
}