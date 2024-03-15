package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio02.domain;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprada;
    private int precoItem;

    public Fatura(String numero, String descricao, int quantidadeComprada, int precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoItem = precoItem;
    }

    public double getTotalFatura() {
        return quantidadeComprada * precoItem;
    }

    public void relatorioFatura() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Quantidade: " + this.quantidadeComprada);
        System.out.println("Preço: " + this.precoItem);
        System.out.println("Valor total da fatura: " + getTotalFatura());
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

    public int getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(int precoItem) {
        this.precoItem = precoItem;
    }
}
