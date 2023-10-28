package tasks;

public class Task2 {

    /**
     * Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами
     * переданного не пустого массива.
     * @param numbers Принимает массив
     * @return Возвращаем разницу между максимальным и минимальным элементами
     */

    public static int returnDifference(int[] numbers) {
        if (numbers.length <= 1) {
            return -1;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return max - min;
    }
}
