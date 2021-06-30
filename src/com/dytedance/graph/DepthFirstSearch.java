package com.dytedance.graph;

/**
 * @author jiazhiyuan
 * @date 2021/6/29 8:39 上午
 */
public class DepthFirstSearch {

    private boolean []marked;

    private int count;

    public DepthFirstSearch(Graph G, int v) {
        marked = new boolean[G.V()];
        dfs(G, v);
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        count ++;
        for(int w: g.adj(v)){
            if(!marked[w]) {
                dfs(g, v);
            }
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }


}



    
