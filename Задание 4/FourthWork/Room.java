package FourthWork;

public class Room {
    private long id;
    private int codeNumbers;
    private int numberPeople;
    private String comfortType;
    private int price;

    public Room(long id, int codeNumbers, int numberPeople, String comfortType, int price) {
        this.id = id;
        this.codeNumbers = codeNumbers;
        this.numberPeople = numberPeople;
        this.comfortType = comfortType;
        this.price = price;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getCodeNumbers() {
        return codeNumbers;
    }
    public void setCodeNumbers(int codeNumbers) {
        this.codeNumbers = codeNumbers;
    }

    public int getNumberPeople() {
        return numberPeople;
    }
    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getComfortType() {
        return comfortType;
    }
    public void setComfortType(String comfortType) {
        this.comfortType = comfortType;
    }

    public int getPrice() {
        return price;
    }
    public void setprice(int price) {
        this.price = price;
    }

    public String toString() {
        return "\nИдентифактор: " + id +
                "\nКод номера: " + codeNumbers +
                "\nКоличество человек: " + numberPeople +
                "\nКомфортность: " + comfortType +
                "\nЦена: " + price + " руб";
    }

}