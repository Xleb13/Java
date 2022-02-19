/*
Реализовать программу, получающую на вход в качестве аргумента имя человека
и выводящую "Hello" + имя, в противном случае, если параметр не передавался,
"Hello world"
 */
package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        if (args.length != 0) {
            String name = args[0];
            System.out.println("Hello" + name);
        } else {
            System.out.println("Hello world");
        }

    }
}