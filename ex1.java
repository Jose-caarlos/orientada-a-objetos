public class Animal {
    
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}

public class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String toString() {
        return "Peixe{" +
                "nome='" + getNome() + '\'' +
                ", peso=" + getPeso() +
                ", tipoHabitat='" + tipoHabitat + '\'' +
                '}';
    }
}

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String toString() {
        return "Cachorro{" +
                "nome='" + getNome() + '\'' +
                ", peso=" + getPeso() +
                ", raca='" + raca + '\'' +
                '}';
    }
}
