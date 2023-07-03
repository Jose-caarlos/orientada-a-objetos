class Veiculo {
    protected String modelo;
    protected double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo + ", Preço: " + preco);
    }
}

class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        return preco * 0.9; // Aplicando um desconto de 10% para motos
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData(String modelo, double preco, int ano) {
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }
}

class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    @Override
    public double getPreco() {
        return preco * 0.95; // Aplicando um desconto de 5% para carros
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData(String modelo, double preco, double km) {
        this.modelo = modelo;
        this.preco = preco;
        this.km = km;
    }
}

public class ExemploClasses {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Veículo Genérico", 10000.0);
        veiculo.printDados();
        System.out.println("Preço: " + veiculo.getPreco());

        Moto moto = new Moto("Honda", 20000.0, 2021);
        moto.printDados();
        System.out.println("Preço: " + moto.getPreco());
        moto.setAno(2022);
        moto.printDados();
        System.out.println("Preço: " + moto.getPreco());

        Carro carro = new Carro("Fiat", 30000.0, 50000.0);
        carro.printDados();
        System.out.println("Preço: " + carro.getPreco());
        carro.setKm(60000.0);
        carro.printDados();
        System.out.println("Preço: " + carro.getPreco());
    }
}
