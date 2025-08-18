class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v = adj.size();
        boolean [] visited = new boolean [v];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i< v;i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, res);
            }
        }
        return res;
    }
    
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean [] visited, ArrayList<Integer> res) {
        visited[node] = true;
        res.add(node);
        for(int n : adj.get(node)) {
        if(!visited[n]) {
            dfs(n , adj, visited, res);
        }
    } 
}
}
