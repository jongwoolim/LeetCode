class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length()) { 
            return "0";
        }

        Stack<Character> stack = new Stack<>();
        
        for (char c : num.toCharArray()) {

            // 스택이 비어있지 않고, 이전 숫자가 현재 숫자보다 클 경우
            while (k > 0 && !stack.isEmpty() && stack.peek() > c) { 
                stack.pop();
                k--;
            }
            stack.push(c); 
        }

        while (k > 0) { // k번 만큼 제거하지 못한 경우
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // 결과값이 0으로 시작하는 경우를 제외하기 위해 0 제거
        while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') { 
            sb.deleteCharAt(sb.length() - 1);
        }
        
        return sb.reverse().toString();
    }
}