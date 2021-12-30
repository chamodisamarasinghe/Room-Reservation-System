package model;

public class CheckRoom {
    private String roomType;
    private String yes;

    public CheckRoom(String roomType, String yes) {
        this.setRoomType(roomType);
        this.setYes(yes);
    }

    public CheckRoom() {
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getYes() {
        return yes;
    }

    public void setYes(String yes) {
        this.yes = yes;
    }
}
