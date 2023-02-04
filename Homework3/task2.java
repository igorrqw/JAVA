// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.


package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        List<Integer> randomlist = createList(10, 0, 50);
        System.out.println("Массив чисел:\n" + randomlist);
        System.out.println();

        System.out.println("Отфильтрованный массив чисел:\n" + filterList(randomlist));
    }


    public static List<Integer> createList(int size, int min, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(min, max));
        }
        return list;
    }


    public static List<Integer> filterList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}