class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int answer = 0;
        int lt = Arrays.stream(weights).max().getAsInt();
        int rt = Arrays.stream(weights).sum();

        while(lt <= rt){

            int mid = (lt + rt) / 2;

            if(getDays(weights, mid) <= days){
                answer = mid;
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    private int getDays(int[] weights, int capacity) {
        int days = 1;
        int sum = 0;

        for(int i=0; i< weights.length; i++){
            if(sum + weights[i] > capacity){
                days++;
                sum = weights[i];
            }else{
                sum += weights[i];
            }
        }

        return days;
    }
}