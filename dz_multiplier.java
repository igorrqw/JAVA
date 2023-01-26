// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;
public class dz_multiplier {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       int userNumber = getUserNumber("Введите число : ");
       System.out.printf("Треугольное число = " + getTriangleNumber(userNumber));
    }
    
    static int getUserNumber(String msg){
        int num = 0;
        do {
            System.out.print(msg);
            num = input.nextInt();
        } while (num<0);
        return num;
    }
    
    static int getTriangleNumber(int num){
        int triangleNumber = num * (num + 1) / 2;
        return triangleNumber;
    }

}
