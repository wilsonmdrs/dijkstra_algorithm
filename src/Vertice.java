import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {
    private final String name;
    private final List<Fronteira> fronteiras;
    private Vertice verticeAnterior;
    private double minDistance = Double.MAX_VALUE;

    public Vertice(String name) {
        this.name = name;
        this.fronteiras = new ArrayList<>();
    }

    public void adicionarVizinho(Fronteira fronteira) {
        this.fronteiras.add(fronteira);
    }

    public List<Fronteira> getFronteiras() {
        return fronteiras;
    }

    public Vertice getVerticeAnterior() {
        return verticeAnterior;
    }

    public void setVerticeAnterior(Vertice verticeAnterior) {
        this.verticeAnterior = verticeAnterior;
    }

    public double getMenorDistancia() {
        return minDistance;
    }

    public void setMenorDistancia(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Vertice verticeOutro) {
        return Double.compare(this.minDistance, verticeOutro.minDistance);
    }
}