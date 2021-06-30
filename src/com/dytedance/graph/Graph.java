package com.dytedance.graph;

/**
 * @author jiazhiyuan
 * @date 2021/6/29 7:52 上午
 */
public class Graph {

    private final int V;         //节点数量

    private int E;               //边的数目

    private Bag<Integer>[] adj;  //邻接表

    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[] )new Bag[V];
        for(int i = 0; i < V; i++) {
            adj[i] = new Bag<Integer>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
         return adj[v];
    }

    public int V() {
        return V;
    }
}



    
