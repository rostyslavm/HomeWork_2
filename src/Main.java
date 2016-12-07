public class Main {

    /*
    Диапазон генерации целых чисел:
    Min + (int)(Math.random() * ((Max - Min) + 1));
     */

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * ((5 - 1) + 1));
        }
        for (Integer i : array) {
            System.out.println(i);
        }
    }

}
