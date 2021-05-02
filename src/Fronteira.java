public class Fronteira {
    private final double peso;
    private final Vertice verticeAlvo;

    public Fronteira(double peso, Vertice verticeInicial, Vertice verticeAlvo) {
        this.peso = peso;
        this.verticeAlvo = verticeAlvo;
    }

    public double getPeso() {
        return peso;
    }

    public Vertice getTargetVertex() {
        return verticeAlvo;
    }
}