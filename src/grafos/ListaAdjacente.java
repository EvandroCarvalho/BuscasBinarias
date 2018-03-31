package grafos;

import buscasGrafos.*;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaAdjacente {
    public static void main(String[] args) {
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
        System.out.println("Lista adjacente:\n" + g);
        new BuscaLargura().busca(g);
        new BuscaProfundidade().profundiade();
    }
}
