package com.company;

public class LuxRoom extends Room {
    private double luxMinRentTime;
    private double luxMaxRentTime;

    public LuxRoom(long id, int codeNumbers, int numberPeople, String comfortType, int price, double lMinRentTime, double lMaxRentTime) {
        super(id, codeNumbers, numberPeople, comfortType, price);
        this.luxMinRentTime = lMinRentTime;
        this.luxMaxRentTime = lMaxRentTime;
    }

    public double getlMinRentTime() {
        return luxMinRentTime;
    }

    public void setlMinRentTime(double lMinRentTime) {
        this.luxMinRentTime = lMinRentTime;
    }

    public double getlMaxRentTime() {
        return luxMaxRentTime;
    }

    public void setlMaxRentTime(double lMaxRentTime) {
        this.luxMaxRentTime = lMaxRentTime;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\nМинимальное время аренды: " + luxMinRentTime +
                "\nМаксимальное время аренды: " + luxMaxRentTime;
    }
}
