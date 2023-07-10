class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        queue.offer(path);

        int target = graph.length - 1;

        while (!queue.isEmpty()) {

            List<Integer> currentPath = queue.poll();
            Integer currentNode = currentPath.get(currentPath.size() - 1);

            if (currentNode == target) {
                answer.add(currentPath);
            } else {

                for (int neighbor : graph[currentNode]) {

                    if (!currentPath.contains(neighbor)) {
                        List<Integer> newPath = new ArrayList<>(currentPath);
                        newPath.add(neighbor);
                        queue.offer(newPath);
                    }

                }
            }
        }
        return answer;
    }
}