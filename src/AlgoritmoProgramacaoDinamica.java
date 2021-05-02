import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class AlgoritmoProgramacaoDinamica {
    public void calcularCaminho(Vertice verticeOrigem) {
        verticeOrigem.setMenorDistancia(0);
        PriorityQueue<Vertice> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.add(verticeOrigem);

        while (!filaPrioridade.isEmpty()) {
            Vertice vertice = filaPrioridade.poll();

            for (Fronteira fronteira : vertice.getFronteiras()) {
                Vertice v = fronteira.getTargetVertex();
                double peso = fronteira.getPeso();
                double menorDistancia = vertice.getMenorDistancia() + peso;

                if (menorDistancia < v.getMenorDistancia()) {
                    filaPrioridade.remove(vertice);
                    v.setVerticeAnterior(vertice);
                    v.setMenorDistancia(menorDistancia);
                    filaPrioridade.add(v);
                }
            }
        }
    }

    public List<Vertice> getMenorCaminhoParaVerticeDestino(Vertice verticeDestino) {
        List<Vertice> path = new ArrayList<>();

        for (Vertice vertice = verticeDestino; vertice != null; vertice = vertice.getVerticeAnterior()) {
            path.add(vertice);
        }

        Collections.reverse(path);
        return path;
    }
}