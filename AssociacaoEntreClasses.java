import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.adicionarAluno(this);
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
        disciplina.removerAluno(this);
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}

class Disciplina {
    private String nome;
    private List<Aluno> alunos;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}

public class ExemploAssociacao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("História");

        aluno1.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina2);
        aluno2.adicionarDisciplina(disciplina1);

        System.out.println("Disciplinas do aluno " + aluno1.getNome() + ":");
        for (Disciplina disciplina : aluno1.getDisciplinas()) {
            System.out.println(disciplina.getNome());
        }

        System.out.println("\nAlunos na disciplina de " + disciplina1.getNome() + ":");
        for (Aluno aluno : disciplina1.getAlunos()) {
            System.out.println(aluno.getNome());
        }
    }
}
