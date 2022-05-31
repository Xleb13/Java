package FourthWork;

public class HalfLuxRoom extends Room{
    private double hluxMinRentTime;
    private double hluxMaxRentTime;

    public HalfLuxRoom(long id, int codeNumbers, int numberPeople, String comfortType, int price, double hluxMinRentTime, double hluxMaxRentTime) {
        super(id, codeNumbers, numberPeople, comfortType, price);
        this.hluxMinRentTime = hluxMinRentTime;
        this.hluxMaxRentTime = hluxMaxRentTime;
    }

    public double gethluxMinRentTime() {
        return hluxMinRentTime;
    }
    public void sethluxMinRentTime(double hluxMinRentTime) {
        this.hluxMinRentTime = hluxMinRentTime;
    }

    public double gethluxMaxRentTime() {
        return hluxMaxRentTime;
    }
    public void sethluxMaxRentTime(double hluxMaxRentTime) {
        this.hluxMaxRentTime = hluxMaxRentTime;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\nМинимальное время аренды: " + hluxMinRentTime +
                "\nМаксимальное время аренды: " + hluxMaxRentTime;
    }
}