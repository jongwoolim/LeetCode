class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = order.toCharArray();

        for(int i=0; i< order.length(); i++){

            map.put(chars[i], i);
        }

        char[] cArr = s.toCharArray();

        for(int i=0; i< cArr.length - 1; i++){

            for(int j=i+1; j<cArr.length; j++){
                
                if(map.getOrDefault(cArr[i], Integer.MAX_VALUE) > map.getOrDefault(cArr[j], Integer.MAX_VALUE)){

                    char tmp = cArr[j];
                    cArr[j] = cArr[i];
                    cArr[i] = tmp;
                }
                
            }
            
        }

        return String.valueOf(cArr);
    }
}