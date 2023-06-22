import java.util.Scanner;

class Motor {
    private int numCilindro;
    private int potencia;

    public Motor() {
        numCilindro = 0;
        potencia = 0;
    }

    public Motor(int numCilindro, int potencia) {
        this.numCilindro = numCilindro;
        this.potencia = potencia;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Cilindros: ");
        numCilindro = scanner.nextInt();

        System.out.print("Potência: ");
        potencia = scanner.nextInt();
    }

    public void print() {
        System.out.println("Número de Cilindros: " + numCilindro);
        System.out.println("Potência: " + potencia);
    }
}

class Veiculo extends Motor {
    private int peso;
    private int velocMax;
    private float preco;

    public Veiculo() {
        peso = 0;
        velocMax = 0;
        preco = 0.0f;
    }

    public Veiculo(int numCilindro, int potencia, int peso, int velocMax, float preco) {
        super(numCilindro, potencia);
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);

        super.insertData();

        System.out.print("Peso (em kg): ");
        peso = scanner.nextInt();

        System.out.print("Velocidade Máxima (em km/h): ");
        velocMax = scanner.nextInt();

        System.out.print("Preço (em R$): ");
        preco = scanner.nextFloat();
    }

    public void print() {
        super.print();
        System.out.println("Peso (em kg): " + peso);
        System.out.println("Velocidade Máxima (em km/h): " + velocMax);
        System.out.println("Preço (em R$): " + preco);
    }
}

class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

    public CarroPasseio() {
        cor = "";
        modelo = "";
    }

    public CarroPasseio(int numCilindro, int potencia, int peso, int velocMax, float preco, String cor, String modelo) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.cor = cor;
        this.modelo = modelo;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);

        super.insertData();

        System.out.print("Cor: ");
        cor = scanner.nextLine();

        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
    }

    public void print() {
        super.print();
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}

class Caminhao extends Veiculo {
    private int toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
        toneladas = 0;
        alturaMax = 0;
        comprimento = 0;
    }

    public Caminhao(int numCilindro, int potencia, int peso, int velocMax, float preco, int toneladas, int alturaMax,
            int comprimento) {
        super(numCilindro, potencia, peso, velocMax, preco);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);

        super.insertData();

        System.out.print("Toneladas (carga máxima): ");
        toneladas = scanner.nextInt();

        System.out.print("Altura Máxima: ");
        alturaMax = scanner.nextInt();

        System.out.print("Comprimento: ");
        comprimento = scanner.nextInt();
    }

    public void print() {
        super.print();
        System.out.println("Toneladas (carga máxima): " + toneladas);
        System.out.println("Altura Máxima: " + alturaMax);
        System.out.println("Comprimento: " + comprimento);
    }
}

public class Main {
    public static void main(String[] args) {
        CarroPasseio carroPasseio = new CarroPasseio();
        System.out.println("Inserindo dados do Carro de Passeio:");
        carroPasseio.insertData();
        System.out.println("\nDados do Carro de Passeio:");
        carroPasseio.print();

        System.out.println("\n");

        Caminhao caminhao = new Caminhao();
        System.out.println("Inserindo dados do Caminhão:");
        caminhao.insertData();
        System.out.println("\nDados do Caminhão:");
        caminhao.print();
    }
}
