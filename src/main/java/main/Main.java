package main;

public class Main {


    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);
        Pessoa pessoa3 = new Pessoa("Pedro", 40);
        Pessoa pessoa4 = new Pessoa("Ana", 35);
        Pessoa pessoa5 = new Pessoa("Carlos", 20);

        Fila fila = new Fila();

        System.out.println("A fila está vazia? " + fila.conferirFila());

        fila.enfileirar(pessoa1);
        fila.enfileirar(pessoa2);
        fila.enfileirar(pessoa3);
        fila.enfileirar(pessoa4);

        System.out.println("Fila após enfileirar 4 pessoas:");
        fila.imprimirFila();

        Pessoa removida = fila.desenfileirar();
        System.out.println("Pessoa removida: " + removida.getNome());

        System.out.println("Fila após remover uma pessoa:");
        fila.imprimirFila();

        fila.enfileirar(pessoa5);

        System.out.println("Fila após enfileirar mais uma pessoa:");
        fila.imprimirFila();

        System.out.println("Tamanho da fila: " + fila.tamanho());

    }

}
