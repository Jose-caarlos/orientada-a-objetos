public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private double precoPorItem;
    
    public Fatura(String numero, String descricao, int quantidadeComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    
    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }
    
    public double getPrecoPorItem() {
        return precoPorItem;
    }
    
    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
    
    public double getTotalFatura() {
        double total = quantidadeComprada * precoPorItem;
        if (total <= 0) {
            return 0.0;
        }
        return total;
    }
}
