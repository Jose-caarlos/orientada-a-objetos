import java.time.LocalDate;
import java.time.Period;

class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        calculaIdade(LocalDate.now());
    }

    private void calculaIdade(LocalDate dataAtual) {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        Period periodo = Period.between(dataNascimento, dataAtual);
        this.idade = periodo.getYears();
    }

    public int informaIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + "\nIdade: " + idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("Albert Einstein:\n" + einstein);
        System.out.println("\nIsaac Newton:\n" + newton);
    }
}
