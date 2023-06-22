import java.util.Scanner;

class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa() {
    }

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public void insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da Empresa: ");
        nome = scanner.nextLine();

        System.out.print("Endereço: ");
        endereco = scanner.nextLine();

        System.out.print("Cidade: ");
        cidade = scanner.nextLine();

        System.out.print("Estado: ");
        estado = scanner.nextLine();

        System.out.print("CEP: ");
        cep = scanner.nextLine();

        System.out.print("Telefone: ");
        fone = scanner.nextLine();
    }

    public void print() {
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + fone);
    }
}

class Restaurante extends Empresa {
    private String tipoComida;
    private double precoMedioPrato;

    public Restaurante() {
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String fone,
            String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.tipoComida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);

        insert();

        System.out.print("Tipo de Comida: ");
        tipoComida = scanner.nextLine();

        System.out.print("Preço Médio de um Prato: ");
        precoMedioPrato = scanner.nextDouble();
    }

    public void print() {
        super.print();
        System.out.println("Tipo de Comida: " + tipoComida);
        System.out.println("Preço Médio de um Prato: " + precoMedioPrato);
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.insertData();
        System.out.println();
        restaurante.print();
    }
}
