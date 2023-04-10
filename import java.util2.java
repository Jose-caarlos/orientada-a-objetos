import java.util.Scanner;

public class CadastroPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sexo, corOlhos, corCabelos;
        int idade;
        double salario;
        int totalFeminino = 0;
        int totalFemininoCastanhosCastanhos = 0;

        while (true) {
            System.out.print("Informe o sexo (m ou f): ");
            sexo = scanner.next().charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo inválido. Informe novamente.");
                continue;
            }

            System.out.print("Informe a cor dos olhos (a, v, c ou p): ");
            corOlhos = scanner.next().charAt(0);
            if (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p') {
                System.out.println("Cor dos olhos inválida. Informe novamente.");
                continue;
            }

            System.out.print("Informe a cor dos cabelos (l, c, p ou r): ");
            corCabelos = scanner.next().charAt(0);
            if (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r') {
                System.out.println("Cor dos cabelos inválida. Informe novamente.");
                continue;
            }

            System.out.print("Informe a idade (entre 10 e 100 anos): ");
            idade = scanner.nextInt();
            if (idade < 10 || idade > 100) {
                System.out.println("Idade inválida. Informe novamente.");
                continue;
            }

            System.out.print("Informe o salário: ");
            salario = scanner.nextDouble();
            if (salario < 0) {
                System.out.println("Salário inválido. Informe novamente.");
                continue;
            }

            if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
                totalFemininoCastanhosCastanhos++;
            }

            if (idade == -1) {
                break;
            }

            if (sexo == 'f') {
                totalFeminino++;
            }
        }

        double porcentagemFemininoCastanhosCastanhos = (double) totalFemininoCastanhosCastanhos / totalFeminino * 100;

        System.out.println("Porcentagem de indivíduos do sexo feminino, com idade entre 18 e 35 anos e que tenham olhos castanhos e cabelos castanhos: " + porcentagemFemininoCastanhosCastanhos + "%.");
    }
}
