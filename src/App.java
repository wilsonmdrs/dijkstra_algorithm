public class App {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        Vertex v7 = new Vertex("7");
        Vertex v8 = new Vertex("8");
        Vertex v9 = new Vertex("9");
        Vertex v10 = new Vertex("10");
        Vertex v11 = new Vertex("11");
        Vertex v12 = new Vertex("12");
        Vertex v13 = new Vertex("13");
        Vertex v14 = new Vertex("14");
        Vertex v15 = new Vertex("15");
        Vertex v16 = new Vertex("16");
        Vertex v17 = new Vertex("17");
        Vertex v18 = new Vertex("18");
        Vertex v19 = new Vertex("19");
        Vertex v20 = new Vertex("20");
        Vertex v21 = new Vertex("21");
        

        v1.addNeighbour(new Edge(3.5, v1, v2));
        v2.addNeighbour(new Edge(3.8, v2, v3));
        v2.addNeighbour(new Edge(3.8, v2, v4));
        v2.addNeighbour(new Edge(0.4, v2, v5));
        v3.addNeighbour(new Edge(3.4, v3, v4));
        v3.addNeighbour(new Edge(1.6, v3, v6));
        v5.addNeighbour(new Edge(5.5, v5, v7));
        v5.addNeighbour(new Edge(6.3, v5, v8));
        v5.addNeighbour(new Edge(4.5, v5, v9));
        v6.addNeighbour(new Edge(1.7, v6, v10));
        v7.addNeighbour(new Edge(2.7, v7, v15));
        v7.addNeighbour(new Edge(2.2, v7, v11));
        v7.addNeighbour(new Edge(4.5, v7, v17));
        v7.addNeighbour(new Edge(2, v7, v18));
        v8.addNeighbour(new Edge(6.7, v8, v7));
        v8.addNeighbour(new Edge(2.3, v8, v12));
        v8.addNeighbour(new Edge(1.7, v8, v11));
        v9.addNeighbour(new Edge(2.4, v9, v12));
        v12.addNeighbour(new Edge(2.9, v12, v16));
        v12.addNeighbour(new Edge(2.7, v12, v11));
        v16.addNeighbour(new Edge(4, v16, v18));
        v11.addNeighbour(new Edge(3.4, v11, v16));
        v11.addNeighbour(new Edge(5, v11, v18));
        v10.addNeighbour(new Edge(2.3, v10, v13));
        v13.addNeighbour(new Edge(1.5, v13, v14));
        v13.addNeighbour(new Edge(4.5, v13, v15));
        v14.addNeighbour(new Edge(3.6, v14, v15));
        v15.addNeighbour(new Edge(1, v15, v17));
        v17.addNeighbour(new Edge(3.7, v17, v18));
        v18.addNeighbour(new Edge(8, v18, v19));
        v18.addNeighbour(new Edge(6.7, v18, v20));
        v20.addNeighbour(new Edge(6.9, v20, v21));
        v18.addNeighbour(new Edge(2.2, v18, v21));
    


        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v21));
    }
}