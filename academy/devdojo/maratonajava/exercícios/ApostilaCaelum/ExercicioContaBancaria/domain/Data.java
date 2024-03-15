package academy.devdojo.maratonajava.exercícios.ApostilaCaelum.ExercicioContaBancaria.domain;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.preencheData(dia, mes, ano);
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }

        int ultimoDiaMes = 31;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaMes = 29;
            } else {
                ultimoDiaMes = 28;
            }
        }

        if (dia > ultimoDiaMes) {
            return false;
        }

        return true;
    }

    public void preencheData (int dia, int mes, int ano) {
        if (isDataViavel(dia, mes, ano) == false) {
            System.out.println("A data é inválida");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public String dataFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

}
