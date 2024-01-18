package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {



    private String nome;
    private TipoCliente tipoCliente; //É uma associação têm um
    private TipoPagamento tipoPagamento; //É uma associação têm um

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
