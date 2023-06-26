class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    int[] ch, pm;
    int m;

    public List<List<Integer>> permute(int[] nums) {
        m = nums.length;
        ch = new int[m];
        pm = new int[m];

        dfs(nums, 0);

        return answer;
    }

    private void dfs(int[] nums, int L) {

        if (L == m) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(pm[i]);
            }
            answer.add(list);
        } else {

            for (int i = 0; i < m; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = nums[i];
                    dfs(nums, L + 1);
                    ch[i] = 0;
                }
            }
        }

    }
}