public class Pessoa {
    private String nome;
    private int idade;
    private Data dataNascimento;

    public Pessoa(String nome, int idade, Data dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

public class Aluno extends Pessoa {
    private int matricula;
    private Data dataMatricula;

    public Aluno(String nome, int idade, Data dataNascimento, int matricula, Data dataMatricula) {
        super(nome, idade, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Data getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Data dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}

public class Funcionario extends Pessoa {
    private int codigoFuncionario;
    private double salario;
    private Data dataAdmissao;

    public Funcionario(String nome, int idade, Data dataNascimento, int codigoFuncionario, double salario, Data dataAdmissao) {
        super(nome, idade, dataNascimento);
        this.codigoFuncionario = codigoFuncionario;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Data dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
