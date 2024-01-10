package academy.devdojo.maratonajava.introdução;

public class Aula09ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrayInt2 = {{23,5}, {4,7,10}, {5,62,23,5,5,6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
