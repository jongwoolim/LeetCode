class Solution {
    public String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (i + 2 < chars.length && chars[i + 2] == '#') {

                StringBuilder sb2 = new StringBuilder();
                sb2.append(chars[i] -'0');
                sb2.append(chars[i + 1] -'0');
                String strChar = sb2.toString();
                
                sb.append(Character.toString(Integer.parseInt(strChar) + 96));
                i += 2;
            } else {
                sb.append(Character.toString(chars[i] - '0' + 96));
            }
        }

        return sb.toString();
    }
}