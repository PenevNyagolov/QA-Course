package property;

public class RealEstate {
    int numberOfStoreys;
    int roomsOfTheFloor;

    public int getNumberOfStoreys() {
        return numberOfStoreys;
    }

    public void setNumberOfStoreys(int numberOfStoreys) {
        this.numberOfStoreys = numberOfStoreys;
    }

    public int getRoomsOfTheFloor() {
        return roomsOfTheFloor;
    }

    public void setRoomsOfTheFloor(int roomsOfTheFloor) {
        this.roomsOfTheFloor = roomsOfTheFloor;
    }

    public void buildingType(){
        System.out.println("Real Estate");
    }

}
