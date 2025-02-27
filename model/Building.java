package model;

import util.Enums;

/*
-Building title
-Number of rooms
-number of floors
 */
public class Building {
    private Enums.BuildingNames buildingName;
    private int numberOfRooms;
    private int numberOfFloors;

    public Building(Enums.BuildingNames buildingName, int numberOfDFloors, int numberOfRooms) {
        this.buildingName = buildingName;
        this.numberOfFloors = numberOfDFloors;
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfDFloors() {
        return numberOfFloors;
    }

    public void setNumberOfDFloors(int numberOfDFloors) {
        this.numberOfFloors = numberOfDFloors;
    }

    public Enums.BuildingNames getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(Enums.BuildingNames buildingName) {
        this.buildingName = buildingName;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }


}
