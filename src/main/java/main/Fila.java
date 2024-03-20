package main;

public class Fila {
    private class No {
        Pessoa pessoa;
        No proximo;

        public No(Pessoa pessoa){
            this.pessoa = pessoa;
            this.proximo = null;
        }
    }
    private No inicio;
    private No fim;

    public Fila(){
        this.inicio = null;
        this.fim = null;
    }
    public boolean conferirFila(){
        return inicio == null;
    }

    public void enfileirar(Pessoa pessoa) {
        No novoNo = new No(pessoa);
        if (conferirFila()){
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public Pessoa desenfileirar() {
        if (conferirFila()){
            System.out.println("Fila vazia");
            return null;
        } else {
            Pessoa pessoa = inicio.pessoa;
            inicio = inicio.proximo;
            if(inicio == null) {
                fim = null;
            }
            return pessoa;
        }
    }

    public void imprimirFila() {
        if(conferirFila()){
            System.out.println("Fila vazia");
        } else {
            No atual = inicio;
            while (atual != null){
                System.out.println("Nome: " + atual.pessoa.getNome() + ", Idade: " + atual.pessoa.getIdade());
                atual = atual.proximo;
            }
        }
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }
}

