class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0;
        int len1 = word1.length(), len2 = word2.length();


        while(p1 < len1 && p2 < len2){
            if(p1 == p2){
                sb.append(word1.charAt(p1++));
            }else if(p1 > p2){
                sb.append(word2.charAt(p2++));
            }
        }

        while(p1 < len1) sb.append(word1.charAt(p1++));
        while(p2 < len2) sb.append(word2.charAt(p2++));

        return sb.toString();
    }
}