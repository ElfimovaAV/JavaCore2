import tasks.Task1;
import tasks.Task2;
import tasks.Task3;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        int[] numbers1 = {10, 5, 8, 24, 13, 57, 40};
        int[] numbers2 = {4, 15, 0, 0, 71, 13, 96, 43, 82};

        System.out.println("Количество чётных элементов в массиве " + Arrays.toString(numbers1) +
                " - " + Task1.countEvens(numbers1));
        System.out.println("Количество чётных элементов в массиве " + Arrays.toString(numbers2) +
                " - " + Task1.countEvens(numbers2));
        System.out.println();
        System.out.println("Разница между максимальным и минимальным значениями в массиве " + Arrays.toString(numbers1) +
                " - " + Task2.returnDifference(numbers1));
        System.out.println("Разница между максимальным и минимальным значениями в массиве " + Arrays.toString(numbers2) +
                " - " + Task2.returnDifference(numbers2));
        System.out.println();
        System.out.println("Имеются два соседних элемента с нулевым значением в массиве " + Arrays.toString(numbers1) +
                " - " + Task3.existZeroNeighbors(numbers1));
        System.out.println("Имеются два соседних элемента с нулевым значением в массиве " + Arrays.toString(numbers2) +
                " - " + Task3.existZeroNeighbors(numbers2));
    }

}
