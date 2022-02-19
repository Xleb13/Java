/*
Написать программу, получающую на вход в качестве аргумента несколько параметров.
В программе вывести "Вы ввели" + N (количество параметров) + "параметров".
Если параметры не передавались, вывести "Вы не передавали параметров"
 */
package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Вы ввели " + args.length + " параметров");
        } else {
            System.out.println("Вы не передали параметров");
        }

    }
}
