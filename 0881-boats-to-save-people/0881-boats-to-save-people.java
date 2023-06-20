class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int lastIdx = people.length - 1;
        int firstIdx = 0;

        while (firstIdx <= lastIdx) {

            if (people[firstIdx] + people[lastIdx] <= limit) {
                firstIdx++;
            }

            lastIdx--;
            answer++;
        }
        return answer;
    }
}