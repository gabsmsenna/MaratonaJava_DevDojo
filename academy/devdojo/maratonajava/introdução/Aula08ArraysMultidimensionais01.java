package academy.devdojo.maratonajava.introdução;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5, Meses
        // 31,28,31,30 Dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        
        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        /*
       Nestes dois for, foi realizado o carregamento dos dois arrays, o array principal "i", e o "j"
       que no caso é o segundo array que está endereçado em memória dentro do primeiro array.
         */
        System.out.println("************************************************");
        for (int[] arrayBase: dias){ // Aqui é criado uma variável de referência, que é temporariária enquantoe este for estiver vivo
            for (int num: arrayBase) { //<---------------- Foreach
                System.out.println(num);
            }
        }
    }
}
