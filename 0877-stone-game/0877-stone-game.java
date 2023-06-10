class Solution {
    public boolean stoneGame(int[] piles) {
        PriorityQueue<Integer> pQueue = new PriorityQueue(Collections.reverseOrder());

        for(int count : piles){
            pQueue.offer(count);
        }

        int aliceSum = 0;
        int bobSum = 0;
        
        int round = 0;
        
        while (!pQueue.isEmpty()){

            int num = pQueue.poll();
            
            if(round % 2 == 0){
                aliceSum += num;
            }else{
                bobSum += num;
            }
        }
        
        return aliceSum > bobSum;
    }
}