import java.util.Arrays;

public class Main {

    /*
    Диапазон генерации целых чисел:
    Min + (int)(Math.random() * ((Max - Min) + 1));
     */

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * ((10 - 1) + 1));
        }
        algorithm(array);
    }

    public static void algorithm(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                System.out.println(Arrays.toString(array));
                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
            }
        }
    }

}
