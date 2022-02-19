/*
Ввести в качестве параметров имя пользователя и пароль.
Проверить в методе main() соответсвие введенных значений заранее определенным значениям.
В случае полного соответсвия вывести сообщение "Вас узнали. Добро пожаловать",
в противном случае вывести сообщение "Логин и пароль не распознаны. Доступ запрещен"
 */
package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите лоигн");
        String login = scanner.next();
        System.out.println("Введите пароль");
        String password = scanner.next();
        if (args.length != 0) {
            if (login.equals(args[0]) && password.equals(args[1])) {
                System.out.println("Вас узнали. Добро пожаловать");
            } else {
                System.out.println("Логин и пароль не распознаны. Доступ запрещен");
            }
        } else {
            System.out.println("Ошибка");
        }

    }
}
