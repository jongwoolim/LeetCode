class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for(int price : prices){
            pQueue.add(price);
        }

        int chocolatePrices = pQueue.poll() + pQueue.poll();

        return chocolatePrices > money ? money : money - chocolatePrices;
    }
}