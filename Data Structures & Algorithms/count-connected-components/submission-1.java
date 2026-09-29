class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge:edges){

            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean visited[] =new boolean[n];

        int count =0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;

                dfs(graph,i,visited);
            }
        }

        return count;

    }

    private void dfs(List<List<Integer>> graph,int node, boolean visited[]){

        visited[node] = true;

        for(int neighbor:graph.get(node)){

            if(!visited[neighbor]){
                dfs(graph,neighbor,visited);
            }
        }
    }
}
