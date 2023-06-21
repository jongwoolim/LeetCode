class Solution {
    

    public int sumFourDivisors(int[] nums) {
        
        int answer = 0;
        
        for (int num : nums) {
            Set<Integer> divisors = findDivisors(num);

            if (divisors.size() == 4) {
                for (int divisor : divisors) {
                    answer += divisor;
                }
            }
        }

        return answer;
    }

    private Set<Integer> findDivisors(int num) {

        Set<Integer> divisors = new HashSet<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisors.add(i);
                divisors.add(num / i);
            }

            if (divisors.size() > 4) {
                break;
            }
        }
        
        return divisors;
    }
}