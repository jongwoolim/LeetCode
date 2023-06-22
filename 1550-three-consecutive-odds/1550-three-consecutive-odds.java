class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int slow = 0;

        for(int i=0; i< arr.length; i++){

            if(arr[i] % 2 != 0){
                slow++;
            }else{
                slow = 0;
            }

            if(slow == 3) return true;
        }

        return false;
    }
}