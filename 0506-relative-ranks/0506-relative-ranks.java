class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Gold Medal");
        map.put(1, "Silver Medal");
        map.put(2, "Bronze Medal");

        String[] answer = new String[score.length];
        PriorityQueue<Integer> pQ = new PriorityQueue<>((o1, o2) -> score[o2] - score[o1]);

        for (int i=0; i< score.length; i++){
            pQ.offer(i);
        }

        int i = 0;
        while(!pQ.isEmpty()){
            Integer poll = pQ.poll();

            if(i < 3){
                answer[poll] = map.get(i);
            }else{
                answer[poll] = String.valueOf(i + 1);
            }

            i++;
        }
        
        return answer;
    }
}