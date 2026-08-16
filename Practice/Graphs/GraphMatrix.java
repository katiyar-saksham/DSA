public class GraphMatrix {

    static int vertices = 5;
    static int[][] matrix = new int[vertices][vertices];

    public static void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }

    public static void createGraph() {
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(3, 4);
    }

    public static void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createGraph();
        printGraph();
    }
}
