class Solution {


    public int maximumRemovals(String s, String p, int[] removable) {

        char[] sChar = s.toCharArray();
        char[] pChar = p.toCharArray();

        int left=0;
        int right=removable.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            for(int i =left ; i<=mid ; i++){
                sChar[removable[i]]='*';
            }

            if(isSequence(sChar , pChar)){
                left = mid+1;
            }else{
                for(int i = left ; i<=mid ; i++){
                    sChar[removable[i]] = s.charAt(removable[i]);
                }
                right=mid-1;
            }
        }

        return left;
    }

    boolean isSequence(char[] s , char[] p){
        int i = 0 , j = 0;
        while(i<s.length && j<p.length){

            if(s[i]==p[j]){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j == p.length;
    }
}