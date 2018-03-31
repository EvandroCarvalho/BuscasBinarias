package buscasGrafos;

import grafos.Grafo;
import grafos.Vertice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BuscaLargura {

     public void busca(Grafo grafo){
         LinkedList<Vertice> visitados = new LinkedList<>();
         Vertice vertice;
         List<String> lista = new ArrayList<>();
        while ( grafo.vertices.size() != 0 ){
                lista.add(grafo.vertices.get(0).nome);
                vertice = grafo.vertices.remove(0);
                while ( vertice.adj.size() != 0 ){
                    System.out.println("Vertice " + vertice.nome.toUpperCase() + ": Origem " + vertice.adj.get(0).origem.nome +
                            "  Destino " + vertice.adj.get(0).destino.nome + " procesado");
                    vertice.adj.remove(0);
                }
        }
         System.out.println("Os seguintes vertices foram visitados e processados: " + lista);
     }
}
