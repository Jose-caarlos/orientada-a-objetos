import java.util.Scanner;
import javax.swing.JOptionPane;

public class CadastroPessoa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o endereço da pessoa: ");
        String enderecoPessoa = scanner.nextLine();
        
        String nomePessoaJOP = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
        int idadePessoaJOP = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
        String enderecoPessoaJOP = JOptionPane.showInputDialog("Digite o endereço da pessoa: ");
        
       
        System.out.println("Nome: " + nomePessoa);
        System.out.println("Idade: " + idadePessoa);
        System.out.println("Endereço: " + enderecoPessoa);
        
        System.out.println("Nome: " + nomePessoaJOP);
        System.out.println("Idade: " + idadePessoaJOP);
        System.out.println("Endereço: " + enderecoPessoaJOP);
    }
}
