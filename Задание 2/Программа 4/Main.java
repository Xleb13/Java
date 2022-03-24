/*
Задача 4. №4
 Дан двумерный массив А, размером (n*n) (или квадратная матрица А).
 Найти произведение минимального и максимального элементов её главной диагонали
 Затем умножить побочную диагональ на максимаьный элемент главной диагонали. */
package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Введите размер массива :"); //определяем размер для массива
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] a = new int[n][n]; //Выделяем место для матрицы
        Random random = new Random();
        int minRND = -10;
        int maxRND = 10;
        int diff = maxRND - minRND;
        System.out.println("Матрица:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int r = random.nextInt(diff + 1); //заполняем матрицу
                r += minRND;
                a[i][j] = r;
                System.out.print(a[i][j] + " "); //вывод матрицы
            }
            System.out.println();
        }

        int minGD = a[0][0]; //поиск минимального знеачения главной диагонали
        for (int i = 0; i < a.length; i++) {
            if (minGD > a[i][i]) {
                minGD = a[i][i];
            }
        }
        System.out.print("Минимальное значение ГД = " + minGD);

        int maxGD = a[0][0]; //поиск максимального значения главной диагонали
        for (int i = 0; i < a.length; i++) {
            if (maxGD < a[i][i]) {
                maxGD = a[i][i];
            }
        }
        System.out.println("\nМаксимальное значение ГД = " + maxGD);
        System.out.println("\nМин*Макс= " + maxGD * minGD); //произведение макс и мин знач

        System.out.println("\nПреобразованная матрица : ");
        for (int i = 0; i < a.length; i++) { //умножение побоч.диагонали на макс
            a[i][a.length - 1 - i] *= maxGD;
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

