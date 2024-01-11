package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    private String nome;
    private TipoCliente tipoCliente; //É uma associação têm um

    //public static final String PESSOA_FISICA = "PESSOA_FISICA"; //Assim eu crio uma limitação para que seja inserido dessa forma o dado
    //public static final String PESSSOA_JURIDICA = "PESSOA_JURIDIA";
    /*
    public Cliente(String nome, String tipo) {
        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSSOA_JURIDICA)) { //Faço o tratamento da exigência no construtor
            return; //Mas não é o melhor caso, ver melhor maneira na classe Enumeração "TipoCliente"
        }
        this.nome = nome;
        this.tipo = tipo;
    }
*/

}
