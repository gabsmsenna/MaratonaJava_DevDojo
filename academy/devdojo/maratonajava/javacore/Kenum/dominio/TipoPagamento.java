package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento { //A classe pode ser criada dentro de outra classe, mas por questão organizacional, é melhor ser criado separado.
        DEBITO {
            @Override
            public double calculoDesconto(double valor) {
                return valor * 0.1; //Sobrescrevendo o método abaixo, com uma tratativa especial para a enumeração DEBITO
            }
        }, CREDITO {
        @Override
        public double calculoDesconto(double valor) {
            return valor * 0.05; //Sobrescrevendo o método abaixo, com uma tratativa especial para a enumeração DEBITO
        }
    };

    public abstract double calculoDesconto(double valor); //Criando um método abstrato, ele não tem corpo, foi criado somente
    // ... para ser sobrescrito. É NECESSÁRIO SER SOBRESCRITO EM TODAS AS NUMERAÇÕES
}