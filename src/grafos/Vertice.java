package grafos;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
    public String nome;
    public List<Aresta> adj;

    Vertice(String nome) {
        this.nome = nome;
        this.adj = new ArrayList<Aresta>();
    }

    public Vertice(){

    }

    void addAdj(Aresta e) {
        adj.add(e);
    }
}
