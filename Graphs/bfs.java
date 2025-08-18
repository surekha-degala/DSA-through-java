class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int v = adj.size();
        boolean [] visited = new boolean[v];
        
        for (int i = 0; i<v;i++) {
            if (!visited [i] ) {
                Queue <Integer> q = new LinkedList<>();
                visited[i] = true;
                q.add(i);
                
                
                while(!q.isEmpty()) {
                    int node = q.poll();
                    result.add(node);
                    
                    for (int n : adj.get(node)) {
                        if (!visited[n]) {
                            visited[n] = true;
                            q.add(n);
                        }
                    }
                }
            }
        } 
        return result;
    }
}
