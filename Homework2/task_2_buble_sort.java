// /* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите
//  в лог-файл.


package Homework2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2_buble_sort {
    private static Random random = new Random();
    public  static void main(String[] args){

        int[] arr = getRandomArray(7, 0, 30);
        createLogInfo(arr);

        for (int element : arr) System.out.printf("%d ", element);
    }
    static void createLogInfo(int[] arr){
        try {
            Logger logger = Logger.getLogger(task_2_buble_sort.class.getName());
            FileHandler fh = new FileHandler("JAVA/Homework2/log_buble_sort.txt");
            logger.addHandler(fh);
            logger.setLevel(Level.INFO);

            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);

            int len =  arr.length;
            int el = 0;
            String str = "";
            for (int i = 0; i < len-1; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (arr[i] > arr[j]) {
                        el = arr[i];
                        arr[i] = arr[j];
                        arr[j] = el;
                        str = "Элемент " + el + " изменил позицию на " + j;
                        logger.info(str);
                    }
                }
                str = "";
            }
            } catch (IOException ex){
                System.out.println("Something happened!");
            }
        }

    static int[] getRandomArray(int size, int min, int max){
        int[] arr = new int[size];//
        int index = 0;
        while (index < size) {
            arr[index] = random.nextInt(min, max);
            index = index + 1;
        }
        return arr;
    }
}

