import java.util.ArrayList;
import java.util.List;

class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdd() {
        return ddd;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void imprimirTelefone() {
        System.out.println("Tipo: " + tipo);
        System.out.println("DDD: " + ddd);
        System.out.println("Número: " + numero);
    }
}

class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void imprimirEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}

class Pessoal {
    private String nome;
    private String cpf;
    private String email;
    private List<Telefone> telefones;
    private Endereco endereco;

    public Pessoal() {
        this.telefones = new ArrayList<>();
        this.endereco = new Endereco();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void removerTelefone(Telefone telefone) {
        telefones.remove(telefone);
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefones:");
        for (Telefone telefone : telefones) {
            telefone.imprimirTelefone();
        }
        System.out.println("Endereço:");
        endereco.imprimirEndereco();
    }
}

class Aluno extends Pessoal {
    private Curso curso;
    private List<Double> notas;

    public Aluno() {
        this.notas = new ArrayList<>();
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void adicionarNota(Double nota) {
        notas.add(nota);
    }

    public void removerNota(Double nota) {
        notas.remove(nota);
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("Média: " + calcularMedia());
    }
}

class Professor extends Pessoal {
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public Professor() {
        this.cursos = new ArrayList<>();
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            curso.imprimirCurso();
        }
    }
}

class Curso {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirCurso() {
        System.out.println("Nome do Curso: " + nome);
    }
}

public class ExemploClasses {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setCpf("123456789");
        aluno.setEmail("joao@example.com");

        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("11");
        telefone1.setNumero("999999999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("11");
        telefone2.setNumero("888888888");

        aluno.adicionarTelefone(telefone1);
        aluno.adicionarTelefone(telefone2);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");

        aluno.setEndereco(endereco);

        Curso curso = new Curso();
        curso.setNome("Ciências da Computação");
        aluno.setCurso(curso);

        aluno.adicionarNota(8.5);
        aluno.adicionarNota(9.0);

        aluno.imprimir();

        System.out.println("------------------------");

        Professor professor = new Professor();
        professor.setNome("Maria");
        professor.setCpf("987654321");
        professor.setEmail("maria@example.com");

        Telefone telefone3 = new Telefone();
        telefone3.setTipo("Celular");
        telefone3.setDdd("11");
        telefone3.setNumero("777777777");

        professor.adicionarTelefone(telefone3);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua B");
        endereco2.setCidade("São Paulo");
        endereco2.setEstado("SP");

        professor.setEndereco(endereco2);

        professor.setTitulacao("Doutorado");
        professor.setSalario(5000.0);

        Curso curso2 = new Curso();
        curso2.setNome("Matemática");
        professor.adicionarCurso(curso2);

        professor.imprimir();
    }
}
