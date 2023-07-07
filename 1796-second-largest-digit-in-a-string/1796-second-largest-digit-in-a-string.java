class Solution {
    public int secondHighest(String s) {
        char[] chars = s.toCharArray();
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (char c : chars) {

            if (Character.isDigit(c)) {
                set.add(c - '0');
            }
        }

        set.pollFirst();
        if(set.isEmpty()){
            return -1;
        }
    
        return set.first();
    }
}