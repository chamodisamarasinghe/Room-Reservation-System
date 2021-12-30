package model;

public class AddRoom {
    private String roomNo;
    private String roomType;

    public AddRoom(String roomNo, String roomType) {
        this.setRoomNo(roomNo);
        this.setRoomType(roomType);
    }

    public AddRoom() {
    }



    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
