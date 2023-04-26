public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("001", "Mouse sem fio", 2, 50.0);
        Fatura fatura2 = new Fatura("002", "Teclado USB", 3, -10.0);
        
        System.out.println("Fatura 1:");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade comprada: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço por item: " + fatura1.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());
        
        System.out.println("Fatura 2:");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade comprada: " + fatura2.getQuantidadeComprada());
        System.out.println("Preço por item: " + fatura2.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura2.getTotalFatura());
    }
}
``
