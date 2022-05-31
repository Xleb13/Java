package FourthWork;

public class StandartRoom extends Room{
    private double stMinRentTime;
    private double stMaxRentTime;

    public StandartRoom(long id, int codeNumbers, int numberPeople, String comfortType, int price, double stMinRentTime, double stMaxRentTime) {
        super(id, codeNumbers, numberPeople, comfortType, price);
        this.stMinRentTime = stMinRentTime;
        this.stMaxRentTime = stMaxRentTime;
    }

    public double getstMinRentTime() {
        return stMinRentTime;
    }
    public void setstMinRentTime(double stMinRentTime) {
        this.stMinRentTime = stMinRentTime;
    }

    public double getstMaxRentTime() {
        return stMaxRentTime;
    }
    public void setstMaxRentTime(double stMaxRentTime) {
        this.stMaxRentTime = stMaxRentTime;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\nМинимальное время аренды: " + stMinRentTime +
                "\nМаксимальное время аренды: " + stMaxRentTime;
    }
}