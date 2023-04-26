public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 2500.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3000.0);
        
        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());
        
        empregado1.aumentoSalario(10.0);
        empregado2.aumentoSalario(10.0);
        
        System.out.println("Novo salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Novo salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());
    }
}
