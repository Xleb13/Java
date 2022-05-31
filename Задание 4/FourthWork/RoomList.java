package FourthWork;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> listOfRoom;

    public RoomList(ArrayList<Room> listOfRoom){
        this.listOfRoom = listOfRoom;
    }

    public void addRoom(Room room){
        listOfRoom.add(room);
    }

    public ArrayList<Room> showRoom(){
        return listOfRoom;
    }

}