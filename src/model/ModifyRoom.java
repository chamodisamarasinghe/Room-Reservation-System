package model;

public class ModifyRoom {
    private String roomNo;
    private String roomType;
    private String typesOfBeds;

    public ModifyRoom(String roomNo, String roomType, String typesOfBeds) {
        this.setRoomNo(roomNo);
        this.setRoomType(roomType);
        this.setTypesOfBeds(typesOfBeds);
    }

    public ModifyRoom() {
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

    public String getTypesOfBeds() {
        return typesOfBeds;
    }

    public void setTypesOfBeds(String typesOfBeds) {
        this.typesOfBeds = typesOfBeds;
    }
}
