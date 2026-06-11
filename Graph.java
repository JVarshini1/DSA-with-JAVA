import java.util.*;

public class Graph {
    
    static class Edge {
        int src;
        int dest;
        int weight;

        
        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        
        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,20));

        
        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,30));

        
        graph[2].add(new Edge(2, 0,20));
        graph[2].add(new Edge(2, 4,40));

        
        graph[3].add(new Edge(3, 1,30));
        graph[3].add(new Edge(3, 4,15));
        graph[3].add(new Edge(3, 5,10));

        
        graph[4].add(new Edge(4, 2,40));
        graph[4].add(new Edge(4, 3,15));
        graph[4].add(new Edge(4, 5,10));

        
        graph[5].add(new Edge(5, 3,10));
        graph[5].add(new Edge(5, 4,10));
        graph[5].add(new Edge(5, 6,14));

        
        graph[6].add(new Edge(6, 5,14));
    }

    
    public static void main(String[] args) {
        int v = 7;

        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        
        System.out.print("Neighbors of vertex 2: ");
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " edge weight " + e.weight);
        }
    }
}