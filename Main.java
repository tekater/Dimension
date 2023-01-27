import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1Dimension = {1, 2, 3, 4};
        System.out.println("Одно измерение (1D)");
        System.out.println(Arrays.toString(array1Dimension));
        System.out.println(" ");

        int[][] array2Dimension = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Два измерения (2D)");
        //System.out.println(Arrays.toString(array2Dimension));
        System.out.println(Arrays.toString(array2Dimension[0]));
        System.out.println(Arrays.toString(array2Dimension[1]));
        System.out.println(" ");

        int[][] array3Dimension = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 9}
        };
        System.out.println("Три измерения (3D)");
        //System.out.println(Arrays.toString(array3Dimension));
        System.out.println(Arrays.toString(array3Dimension[0]));
        System.out.println(Arrays.toString(array3Dimension[1]));
        System.out.println(Arrays.toString(array3Dimension[2]));
        //int number = array3Dimension[1][2];
        //System.out.println(number);
        System.out.println(Arrays.toString(new int[]{array3Dimension[1][2]}));

        // Создаём в цикле двумерный массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение Y");
        int a = 30; //scanner.nextInt();
        System.out.println("Введите значение X");
        int b = 20; //scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int y = 0; y < b; y++) {
                System.out.print("_" + " ");
            }
            System.out.println();
        }
        Random random = new Random();
        // Заполняем уже созданный массив каким-то значением
        Date newDate = new Date();
        // Преобразовываем Date в String
        Instant instant = newDate.toInstant();
        String stringFromDate = instant.toString();
        // Преобразовываем Date в String - end
        String regex = "[a-zA-Z\\.:-]";
        String[] myDateArray = stringFromDate.split(regex);
        System.out.println("New date: " + newDate);

        System.out.println(Arrays.toString(myDateArray));
        int[][] field = new int[2][10];

        for(int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                String[] myDateArray2 = stringFromDate.split(regex);
                int par = Integer.parseInt(myDateArray2[random.nextInt(myDateArray2.length)]);
                field[x][y] = par;
            }
        }
        System.out.println(Arrays.toString(field[0]));
        System.out.println(Arrays.toString(field[1]));
    }
    public static Date getDate() {
        Date getdate = new Date();
        return getdate;
    }
}
