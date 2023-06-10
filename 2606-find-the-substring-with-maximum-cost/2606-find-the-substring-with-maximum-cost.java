class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        int[] maxArr = new int[s.length()];

        int idx = 0;
        for(char c: chars.toCharArray())
            map.put(c, vals[idx++]);

        for(int i=0; i< s.length(); i++){

            int current = s.charAt(i) - 96;
            
            if(map.containsKey(s.charAt(i))){
                current =  map.get(s.charAt(i));
            }
            
            maxArr[i] = current;
        }

        for(int i=1; i< maxArr.length; i++){
            maxArr[i] = Math.max(maxArr[i], maxArr[i] + maxArr[i - 1]);

            answer = Math.max(answer, maxArr[i]);
        }

        return Math.max(maxArr[0], answer);
    }
}