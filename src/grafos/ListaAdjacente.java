package grafos;

import buscasGrafos.*;



public class ListaAdjacente {
    public static void main(String[] args) {

        System.out.println("Lista adjacente:\n" + listaAdjacente());
        System.out.println("-------------------------------------");
        System.out.println("Buscar em largura:");
        new BuscaLargura().busca(listaAdjacente());
        System.out.println("-------------------------------------");
        System.out.println("Busca em profundidade:");
        new BuscaProfundidade("z").busca(listaAdjacente().vertices.get(0));
    }

    public static Grafo listaAdjacente(){
        Grafo g = new Grafo();
        Vertice s = g.addVertice("s");
        Vertice a = g.addVertice("a");
        Vertice t = g.addVertice("t");
        Vertice y = g.addVertice("y");
        Vertice z = g.addVertice("z");
        Aresta st = g.addAresta(s, t);
        Aresta sa = g.addAresta(s, a);
        Aresta sy = g.addAresta(s, y);
        Aresta ty = g.addAresta(t, y);
        Aresta yt = g.addAresta(y, t);
        Aresta yz = g.addAresta(y, z);
        return g;

    }
}
