package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luffy", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("Zoro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente);
        System.out.println(TipoPagamento.DEBITO.calculoDesconto(200));
        System.out.println(TipoPagamento.CREDITO.calculoDesconto(200));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipCliente2);


    }
}
