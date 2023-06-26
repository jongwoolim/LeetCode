class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(n == 1) return true;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i< n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i< edges.length; i++){

            int size = edges[i].length;

            graph.get(edges[i][size-2]).add(edges[i][size - 1]);
            graph.get(edges[i][size-1]).add(edges[i][size - 2]);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.offer(source);
        visited[source] = true;

        while(!q.isEmpty()){
            
            Integer v = q.poll();
            if(v == destination) return true;
            
            List<Integer> list = graph.get(v);

            for (int node : list){
                
                if(!visited[node]){
                    q.offer(node);
                    visited[node] = true;    
                }
            }
        }

        return false;
    }
}