package com.company;

public class Main {
    public static void main(String[] args) {
        if(args.length !=0){
            String name = args[0];
            System.out.println("Hello " + name);
        }
        else{
            System.out.println("Hello world");
        }
    }
}
