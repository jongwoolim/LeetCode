class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] inStack = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            count[index]--;

            // 스택에 이미 있는 경우, 건너뛰기
            if (inStack[index]) continue;

            // 스택에 없는 경우 그리디 방식으로 스택에 추가
            while (!stack.isEmpty() &&
                    c < stack.peek() &&
                    count[stack.peek() - 'a'] > 0) {

                char removedChar = stack.pop();
                inStack[removedChar - 'a'] = false;
            }

            stack.push(c);
            inStack[index] = true;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}