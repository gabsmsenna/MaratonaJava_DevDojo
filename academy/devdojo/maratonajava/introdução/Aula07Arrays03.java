package academy.devdojo.maratonajava.introdução;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4};
        int[] numeros4 = new int[]{5,6,7,8,9};
/*
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
 */
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for(int num:numeros4) {
            System.out.println(num);
        }
    }
}
