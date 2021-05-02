public class Museu {
    public static void main(String[] args) {
        //Instanciando os vertices
        Vertice v1 = new Vertice("1");
        Vertice v2 = new Vertice("2");
        Vertice v3 = new Vertice("3");
        Vertice v4 = new Vertice("4");
        Vertice v5 = new Vertice("5");
        Vertice v6 = new Vertice("6");
        Vertice v7 = new Vertice("7");
        Vertice v8 = new Vertice("8");
        Vertice v9 = new Vertice("9");
        Vertice v10 = new Vertice("10");
        Vertice v11 = new Vertice("11");
        Vertice v12 = new Vertice("12");
        Vertice v13 = new Vertice("13");
        Vertice v14 = new Vertice("14");
        Vertice v15 = new Vertice("15");
        Vertice v16 = new Vertice("16");
        Vertice v17 = new Vertice("17");
        Vertice v18 = new Vertice("18");
        Vertice v19 = new Vertice("19");
        Vertice v20 = new Vertice("20");
        Vertice v21 = new Vertice("21");
        
        //Populando os vertices
        v1.adicionarVizinho(new Fronteira(3.5, v2));
        v2.adicionarVizinho(new Fronteira(3.8, v3));
        v2.adicionarVizinho(new Fronteira(3.8, v4));
        v2.adicionarVizinho(new Fronteira(0.4, v5));
        v3.adicionarVizinho(new Fronteira(3.4, v4));
        v3.adicionarVizinho(new Fronteira(1.6, v6));
        v5.adicionarVizinho(new Fronteira(5.5, v7));
        v5.adicionarVizinho(new Fronteira(6.3, v8));
        v5.adicionarVizinho(new Fronteira(4.5, v9));
        v6.adicionarVizinho(new Fronteira(1.7, v10));
        v7.adicionarVizinho(new Fronteira(2.7, v15));
        v7.adicionarVizinho(new Fronteira(2.2, v11));
        v7.adicionarVizinho(new Fronteira(4.5, v17));
        v7.adicionarVizinho(new Fronteira(2, v18));
        v8.adicionarVizinho(new Fronteira(6.7, v7));
        v8.adicionarVizinho(new Fronteira(2.3, v12));
        v8.adicionarVizinho(new Fronteira(1.7, v11));
        v9.adicionarVizinho(new Fronteira(2.4, v12));
        v12.adicionarVizinho(new Fronteira(2.9, v16));
        v12.adicionarVizinho(new Fronteira(2.7, v11));
        v16.adicionarVizinho(new Fronteira(4, v18));
        v11.adicionarVizinho(new Fronteira(3.4, v16));
        v11.adicionarVizinho(new Fronteira(5, v18));
        v10.adicionarVizinho(new Fronteira(2.3, v13));
        v13.adicionarVizinho(new Fronteira(1.5, v14));
        v13.adicionarVizinho(new Fronteira(4.5, v15));
        v14.adicionarVizinho(new Fronteira(3.6, v15));
        v15.adicionarVizinho(new Fronteira(1, v17));
        v17.adicionarVizinho(new Fronteira(3.7, v18));
        v18.adicionarVizinho(new Fronteira(8, v19));
        v18.adicionarVizinho(new Fronteira(6.7, v20));
        v20.adicionarVizinho(new Fronteira(6.9, v21));
        v18.adicionarVizinho(new Fronteira(2.2, v21));

        //Instaciando a classe do algoritmo de programação dinamica
        AlgoritmoProgramacaoDinamica algoritmoProgramacaoDinamica = new AlgoritmoProgramacaoDinamica();

        //Iniciando o vertice inicial
        algoritmoProgramacaoDinamica.calcularCaminho(v1);

        //Solicitando o calculo da menor rota
        System.out.println(algoritmoProgramacaoDinamica.getMenorCaminhoParaVerticeDestino(v21));
    }
}