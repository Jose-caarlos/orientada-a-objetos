public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
    
    public void aumentoSalario(double porcentagem) {
        salarioMensal *= (1 + porcentagem/100);
    }
}
