package arvoresBinarias;

public class Arvore {
    static No raiz;

    public static void insert(int valor){
        insert(valor, raiz);
    }

    public static void insert(int valor, No no) {
        if (raiz == null) {
            System.out.println("inserindo raiz");
            raiz = new No(valor);
        } else {
            if ( valor < no.getValor() ){
                if ( no.getNoEsquerdo() != null ){
                    insert(valor, no.getNoEsquerdo());
                }
                else {
                    System.out.println("inserindo no esquerdo");
                    no.setNoEsquerdo(new No(valor));
                }
            } else {
                if ( no.getNoDireto() != null ){
                    insert(valor, no.getNoDireto());
                }else {
                    System.out.println("inserindo no direito");
                    no.setNoDireto(new No(valor));
                }
            }
        }
    }

    public static void print(No no){
        if(no != null){
            print(no.getNoEsquerdo());
            print(no.getNoDireto());
            System.out.print(no.getValor() + ",");
        }
    }

    public static void main(String[] args) {
        insert(5);
        insert(6);
        insert(8);
        insert(2);
        insert(3);
        insert(0);
        insert(1);
        print(raiz);

    }
}
