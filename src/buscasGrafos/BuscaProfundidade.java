package buscasGrafos;


import grafos.Grafo;
import grafos.Vertice;

import java.util.ArrayList;

public class BuscaProfundidade {
    static ArrayList<String> lista = new ArrayList<>();
    public static void profundidade(Grafo grafo){
        while ( grafo.vertices.size() != 0 ){
            profundidade(grafo.vertices.remove(0));
        }
        System.out.println("Vertices visitados " + lista);
    }
    public static void profundidade(Vertice vertice) {
        if(!lista.contains(vertice.nome)){
            lista.add(vertice.nome);
        }
    }
}
