/*
Передавать в качестве параметров два целочисленных числа. Вывести на экран
как сами значения? так и их сумму ("3 + 2 = 5"). Если количество параметров
не равно 2, вывести сообщение "Неверное количество параметров"
 */
package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        } else {
            System.out.println("Неверное количество параметров");
        }

    }
}