import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarrosVendidos = entrada.nextInt();

        System.out.print("Digite o valor total de vendas: R$ ");
        double valorTotalVendas = entrada.nextDouble();

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = entrada.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: R$ ");
        double valorPorCarroVendido = entrada.nextDouble();

        double comissaoFixa = numeroCarrosVendidos * valorPorCarroVendido;
        double comissaoPorcentagem = 0.05 * valorTotalVendas;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPorcentagem;

        System.out.printf("O salário final do vendedor é R$ %.2f", salarioFinal);
    }
}
