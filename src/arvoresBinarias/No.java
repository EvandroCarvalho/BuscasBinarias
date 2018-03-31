package arvoresBinarias;

import java.util.Objects;

public class No {
    public int valor;
    public No noEsquerdo;
    public No noDireto;

    No(int valor){
        this.valor = valor;
    }
    No(){

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(No noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public No getNoDireto() {
        return noDireto;
    }

    public void setNoDireto(No noDireto) {
        this.noDireto = noDireto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        No no = (No) o;
        return valor == no.valor;
    }

    @Override
    public int hashCode() {

        return Objects.hash(valor);
    }
}
