package academy.devdojo.maratonajava.javacore.Gassosiação.domain;

public class Escola {
    private String nomeEscola;
    private Professor[] professores; //Relacionamento muitos para um com a escola, uma escola pode ter vários professores, mas o professor so pode pertencer a uma escola.

    public Escola(String nome) {
        this.nomeEscola = nome;
    }

    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nomeEscola);
        if (professores == null) {
            return;
        }
        for (Professor professores : professores) {
            System.out.println(professores.getNome());
        }

    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

}
