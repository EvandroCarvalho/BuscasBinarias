package buscasGrafos;


import grafos.Vertice;


import java.util.Stack;

public class BuscaProfundidade {
    static Stack<Vertice> pilha = new Stack<>();
    static String valorBusca;
    public BuscaProfundidade(String valorBusca){
        this.valorBusca = valorBusca;
    }
    public boolean resultadoBusca(Vertice vertice){
            return vertice.nome.equals(valorBusca);
    }

    public void busca(Vertice vertice){
        this.pilha.add(vertice);
        if(resultadoBusca(vertice)) {
            System.out.println("Encontrado: " + valorBusca);
            System.exit(0);
        }
        else {
            for(int i = 0; i < vertice.adj.size(); i++){
                if( vertice.adj.get(i) != null){
                    if( this.pilha.contains(vertice.adj.get(i).destino) )
                        continue;
                    this.busca(vertice.adj.get(i).destino);
                }
            }
        }
        caminhoPercorrido(this.pilha);
        this.pilha.pop();

    }
    private void caminhoPercorrido(Stack<Vertice> pilha){
        for(int i = 0; i < pilha.size(); i++){
            System.out.print(pilha.get(i).nome + " -> ");
        }
        System.out.println("");
    }
}
