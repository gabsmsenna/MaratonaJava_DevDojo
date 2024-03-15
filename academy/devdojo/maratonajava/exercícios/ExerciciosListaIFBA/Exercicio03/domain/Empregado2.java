package academy.devdojo.maratonajava.exercícios.ExerciciosListaIFBA.Exercicio03.domain;

    public class Empregado2 {
        private String nome;
        private String sobrenome;
        private double salarioMensal;

        // Construtor
        public Empregado2 (String nome, String sobrenome, double salarioMensal) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.salarioMensal = salarioMensal;
        }

        // Métodos getters e setters para cada variável de instância
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public double getSalarioMensal() {
            return salarioMensal;
        }

        public void setSalarioMensal(double salarioMensal) {
            this.salarioMensal = salarioMensal;
        }

        // Método para calcular o salário anual
        public double salarioAnual() {
            return salarioMensal * 12;
        }
    }


