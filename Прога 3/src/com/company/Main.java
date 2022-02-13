package com.company;

public class Main {
    public static void main(String[] args) {
        if(args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a+b;
            System.out.println(a + "+" + b + "=" + result);
        }
        else{
            System.out.println("Неверное количество параметров");
        }
    }
}
