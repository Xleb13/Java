/* Задача 1. №4
 Определить дополнительный массив разрешенных значений. Определить и вывести на экран,
 сколько элементов исходного массива имеют разрешенные значения */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Введите размер массива :"); //определяем размер для массива
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a =new int[n];

        for(int i=0; i<n; i++)
            a[i]=((char) (Math.random()*3)); //заполняем массив случайными числами

        for(int i=0;i<n;i++)
             System.out.println(a[i]);

        /*Разрешенным значением соответсвуют нечетные числа, к не соответствующим
        отнесем четные числа */
        int k = 0;
        for(int i = 0; i<n; i++) //Определаем количество чисел, не кратных 6
            if (a[i] % 6==0) {
                k++;
            }
        System.out.println();
        System.out.println(k);

    }
}

