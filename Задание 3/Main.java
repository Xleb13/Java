/* Вариант 4 Гостиница
Room - комната
Свойства:
Id - идентификатор
codeNumbers - Код номера
numberPeople - Количество человек
comfortType - Комфортность
price - цена */
package com.company;

public class Main {
    public static void main(String[] args) {
        long id = 92;
        int codeNumbers = 12;
        int numberPeople = 2;
        String comfortType = "Эконом";
        int price = 1200;
        Room exampleObject = new Room(id, codeNumbers, numberPeople, comfortType, price);
        System.out.println(exampleObject);
    }
}
