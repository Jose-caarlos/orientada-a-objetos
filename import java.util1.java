import java.util.Scanner;

public class CalculadoraCalorias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int caloriasPrato, caloriasSobremesa, caloriasBebida;
        caloriasPrato = 800;
        caloriasSobremesa = 400;
        caloriasBebida = 200;

        System.out.println("Informe o prato: ");
        String prato = scanner.nextLine();
        System.out.println("Informe a sobremesa: ");
        String sobremesa = scanner.nextLine();
        System.out.println("Informe a bebida: ");
        String bebida = scanner.nextLine();
        
       
        int totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;
        
        
        System.out.println("A quantidade total de calorias da sua refeição (" + prato + ", " + sobremesa + ", " + bebida + ") é de " + totalCalorias + " calorias.");
    }

}
