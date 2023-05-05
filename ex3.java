public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Endereço: " + endereco + "\n" +
               "Telefone: " + telefone + "\n";
    }
}
public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    public double getValorCredito() {
        return valorCredito;
    }
    
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    
    public double getValorDivida() {
        return valorDivida;
    }
    
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
    
    public String toString() {
        return super.toString() +
               "Valor do crédito: " + valorCredito + "\n" +
               "Valor da dívida: " + valorDivida + "\n" +
               "Saldo: " + obterSaldo() + "\n";
    }
}
public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public int getCodigoSetor() {
        return codigoSetor;
    }
    
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getImposto() {
        return imposto;
    }
    
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "Código do setor: " + codigoSetor + "\n" +
               "Salário base: " + salarioBase + "\n" +
               "Imposto: " + imposto + "\n" +
               "Salário líquido: " + calcularSalario() + "\n";
    }
}
public class Administrador extends Empregado {
    private double ajudaDeCusto;
    
    public double getAjudaDeCusto() {
        return ajudaDeCusto
    }
}

