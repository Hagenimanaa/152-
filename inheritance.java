import java.util.ArrayList;
import java.util.List;

class Graph {
    private int V;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.V = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        adjList.get(v).add(w);
        adjList.get(w).add(v);
    }
}

 class GraphExample {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        System.out.println("Edges added to the graph.");
    }
}