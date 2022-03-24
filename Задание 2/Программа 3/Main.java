/*
Задача 3. №4
 Определить матрицу (двумерный массив) и ее заполнить случайными значениями.
  Построить вектор B, который возвращает - максимальное значение i-м столбце.
*/
package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n;
        System.out.println("Введите размер массива :"); //определяем размер для массива
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] vectorB = new int[n]; //Выделяем место для матрицы
        int[][] a = new int[n][n];
        int max;
        Random random = new Random();
        int minRND = -10;
        int maxRND = 10;
        int diff = maxRND - minRND;
        System.out.println("Матрица :");

        for (int i = 0; i < a.length; i++) { //поиск макс значения
            for (int j = 0; j < a.length; j++) { //заполняем матрицу
                int r = random.nextInt(diff + 1);
                r += minRND;
                a[i][j] = r;
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < a.length; j++) {// проход по столбцам
                if (a[j][i] > max) {
                    max = a[j][i];
                }
            }
            vectorB[i] = max;
        }

        for (int[] ints : a) {  //Вывод матрицы на экран
            for (int j = 0; j < a.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Максимальное значение столбца " + i  + " = " + vectorB[i]);
        }
    }
}