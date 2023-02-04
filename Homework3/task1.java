// Реализовать алгоритм сортировки слиянием.
 

package Homework3;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] array = randomArr();
        System.out.println(Arrays.toString(sortArr(array)));

    }
    public static int[] randomArr() {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        return arr;
    }
    
    
    public static int[] sortArr(int[] array){
        if (array == null) return null;
        if (array.length < 2) return array;

        int leftPartArray[] = new int[array.length/2];
        System.arraycopy(array, 0, leftPartArray, 0, array.length/2);
        

        int rightPartArray[] = new int[array.length-leftPartArray.length];
        System.arraycopy(array, leftPartArray.length, rightPartArray, 0, array.length-leftPartArray.length);
        
        sortArr(leftPartArray);
        sortArr(rightPartArray);

        mergeArr(array, leftPartArray,rightPartArray);
        return array;
    }

    public static void mergeArr(int[] array, int[] leftPartArray, int[] rightPartArray) {
        int positionLeftArr = 0;
        int positionRightArr = 0;
        int len = array.length;

        for (int i = 0; i < len; i++) {
            if (positionLeftArr == leftPartArray.length){
                array[i] = rightPartArray[positionRightArr];
                positionRightArr++;
            } else if (positionRightArr == rightPartArray.length) {
                array[i] = leftPartArray[positionLeftArr];
                positionLeftArr++;
            } else if (leftPartArray[positionLeftArr] < rightPartArray[positionRightArr]) {
                array[i] = leftPartArray[positionLeftArr];
                positionLeftArr++;
            } else {
                array[i] = rightPartArray[positionRightArr];
                positionRightArr++;
            }
        }
    }

}