package com.company;

/*
Вариант 4 Гостиница
Создать родительский класс "Комната" (идентификатор, номер, количество члевек, цена) и дочерние классы:
 - "Стандартная комната"
 - "Комната полулюкс"
 - "Комната люкс"
 Реализовать класс для храненеия списка номеров с методом добавдения номера и методом печати списка номероы.
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Room> listOfRoom = new ArrayList<>();
        RoomList roomList = new RoomList(listOfRoom);

        long stId = 92;
        int stCodeNumbers = 12;
        int stNumberPeople = 2;
        String stComfortType = "Эконом";
        int stPrice = 1200;
        double stMinRentTime = 2;
        double stMaxRentTime = 10;
        StandartRoom st = new StandartRoom(stId,stCodeNumbers,stNumberPeople,stComfortType,stPrice,stMinRentTime,stMaxRentTime);

        roomList.addRoom(st);

        long hluxId = 45;
        int hluxCodeNumbers = 7;
        int hluxNumberPeople = 3;
        String hluxComfortType = "Полулюкс";
        int hluxPrice = 2100;
        double hluxMinRentTime = 3;
        double hluxMaxRentTime = 14;
        HalfLuxRoom hlux = new HalfLuxRoom(hluxId,hluxCodeNumbers,hluxNumberPeople,hluxComfortType,hluxPrice,hluxMinRentTime,hluxMaxRentTime);

        roomList.addRoom(hlux);


        long luxId = 124;
        int luxCodeNumbers = 1;
        int luxNumberPeople = 3;
        String luxComfortType = "Люкс";
        int luxPrice = 3200;
        double luxMinRentTime = 1;
        double luxMaxRentTime = 21;
        LuxRoom lux = new LuxRoom(luxId,luxCodeNumbers,luxNumberPeople,luxComfortType,luxPrice,luxMinRentTime,luxMaxRentTime);

        roomList.addRoom(lux);

        System.out.println(roomList.showRoom());
    }
}