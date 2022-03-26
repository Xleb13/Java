/*
Задача 2. №4
Дан массив b (n). Переписать в массив C(n) отрицательные элементы массива
b(n) умноженные на 4. (со сжатием., без пустых элементов внутри).
Затем упорядочить методом "выбора и перестановки" по возрастанию новый массив.
 */
package com.company;

import java.util.Random;
import java.util.Scanner;
public class Main {
    static void SortRearr(float[] a) { //метод выбора и перестановки
        for (int i = 0; i < a.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }
            float rearr = a[m];
            a[m] = a[i];
            a[i] = rearr;
        }
    }
    public static void main(String[] args) {
        int s;
        System.out.print("Введите размерность массива: ");
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        int[] a = new int[s];
        float[] b = new float[a.length];
        int k = 0;
        Random random = new Random(); //задание параметров рандома
        int max = 10;
        int min = -10;
        int diff = max - min;
        System.out.print("Массив B: "); //Создание массива со значениями
        for (int i = 0; i < a.length; i++) {
            int r = random.nextInt(diff + 1);
            r += min;
            a[i] = r;
            System.out.print(a[i] + " ");
            if (a[i] < 0) {
                b[k] = a[i];
                k++;
            }
        }
        System.out.print("\nМассив C: "); //Создание массива С и умножение элементов
        float[] C = new float[k];
        for (int i = 0; i < C.length; i++) {
            C[i] = b[i] * 4;
            System.out.print(C[i] + " ");
        }
        System.out.print("\nОтсортированный массив C: ");
        SortRearr(C); //сортировка массива С
        for (int i = 0; i < C.length ; i++) { //вывод сортированного массива
            System.out.print(C[i] + " ");
        }
    }
}
