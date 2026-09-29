class Solution {

//Valid Tree = Connected + No Cycle

    public boolean validTree(int n, int[][] edges) {

        if(edges.length != n-1){
            return false;
        }

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

        boolean visited[] = new boolean[n];

        if(!dfs(graph,0,-1,visited)){
            return false;
        }

        for(boolean node:visited){
            if(!node){
                return false;
            }
        }

        return true;

    }

    private boolean dfs(List<List<Integer>> graph,int node, int parent,boolean visited[]){

        visited[node] = true;

        for(int neighbor: graph.get(node)){

            if(neighbor == parent){
                continue;
            }

            if(visited[neighbor]){
                return false;
            }

            if(!dfs(graph,neighbor, node, visited)){
                return false;
            }
        }

        return true;
    }
}
