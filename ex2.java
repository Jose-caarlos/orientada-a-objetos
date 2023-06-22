class Livro {
    private String nome;
    private double preco;
    private String autor;

    public Livro(String nome, double preco, String autor) {
        this.nome = nome;
        this.preco = preco;
        this.autor = autor;
    }

    public void imprimirDetalhes() {
        System.out.println("Livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Autor: " + autor);
        System.out.println();
    }
}

class CD {
    private String nome;
    private double preco;
    private int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        this.nome = nome;
        this.preco = preco;
        this.numeroFaixas = numeroFaixas;
    }

    public void imprimirDetalhes() {
        System.out.println("CD:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Número de Faixas: " + numeroFaixas);
        System.out.println();
    }
}

class DVD {
    private String nome;
    private double preco;
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public void imprimirDetalhes() {
        System.out.println("DVD:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println();
    }
}

public class Loja {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Quixote", 39.90, "Miguel de Cervantes");
        CD cd = new CD("Thriller", 29.99, 9);
        DVD dvd = new DVD("O Senhor dos Anéis: A Sociedade do Anel", 49.90, 178);

        livro.imprimirDetalhes();
        cd.imprimirDetalhes();
        dvd.imprimirDetalhes();
    }
}
