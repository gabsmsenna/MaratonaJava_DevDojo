package academy.devdojo.maratonajava.exercícios.domain;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---------------");
        System.out.println("Professor: "+ this.nome);

        if (this.seminarios == null) return;

        System.out.println("Seminarios cadastrados");

        for (Seminario objSeminariosFor : this.seminarios) {
            System.out.println(objSeminariosFor.getTitulo());
            System.out.println(objSeminariosFor.getLocal().getEndereço());
            System.out.println("** Alunos **");
            for (Aluno aluno : objSeminariosFor.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + "idade: " + aluno.getIdade());
            }


        }
        }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

