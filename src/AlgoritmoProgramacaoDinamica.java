import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class AlgoritmoProgramacaoDinamica {

    //Calcula a distancia entre o vertice origem e todos os outros vertices
    public void calcularCaminho(Vertice verticeOrigem) {
        verticeOrigem.setMenorDistancia(0);
        PriorityQueue<Vertice> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.add(verticeOrigem);

        while (!filaPrioridade.isEmpty()) {
            //Pegando o topo da fila e removendo
            Vertice vertice = filaPrioridade.poll();

            //Pegando todas os vertices que fazem fronteira com o vertice atual
            for (Fronteira fronteira : vertice.getFronteiras()) {
                Vertice v = fronteira.getVerticeAlvo();
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