package arrays2d;

public class Array2dOperations {
    public static void main(String[] args) {

        double array[][] = new double[3][];
        array[0] = new double[]{1.0, 1.5, 2.0};
        array[1] = new double[]{1.5, 2.0, 2.5};
        array[2] = new double[]{2.0, 2.5, 3.0};

        System.out.println("Dana tablica: ");
        for(int i=0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        double sum1 = (array[0][0] * array[1][1] * array[2][2]) + (array[0][2] * array[1][1] * array[2][0]);
        double multiply = (array[1][0] + array[1][1] + array[1][2]) * (array[0][1] + array[1][1] + array[2][1]);

        double sum2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum2 += array[i][j];
            }
        }

        System.out.println("Suma iloczynow przekatnych tablicy: " + sum1);
        System.out.println("Iloczyn sum: " + multiply);
        System.out.println("Suma wszystkich elementow krawedzi: " + (sum2 - array[1][1]));
    }
}
