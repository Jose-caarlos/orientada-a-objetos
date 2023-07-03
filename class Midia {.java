class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {}

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Mídia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println(getDetalhes());
    }

    public void inserirDados(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
}

class DVD extends Midia {
    private int nFaixas;

    public DVD() {}

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    public void setFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public void inserirDados(int codigo, double preco, String nome, int nFaixas) {
        super.inserirDados(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }
}

class CD extends Midia {
    private int nMusicas;

    public CD() {}

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    public void setMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public void inserirDados(int codigo, double preco, String nome, int nMusicas) {
        super.inserirDados(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }
}

public class ExemploClasses {
    public static void main(String[] args) {
        Midia midia = new Midia();
        midia.inserirDados(1, 19.99, "Filme 1");
        midia.printDados();

        DVD dvd = new DVD();
        dvd.inserirDados(2, 29.99, "Filme 2", 12);
        dvd.printDados();

        CD cd = new CD();
        cd.inserirDados(3, 9.99, "Álbum 1", 10);
        cd.printDados();
    }
}
