package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static House[] randomHouseArray(int arrSize) {
        House[] ar = new House[arrSize];
        Random random = new Random();
        String[] Streets = {"Brovn Street" , "Carson Street" , "Granby Street" , "Pearl Street" ,
                "Creek Stree" , "Dickson Street" , "Peachtree Street" , "Eighth Street"};
        for (int i = 0; i < arrSize; i++) {
            ar[i] = new House(
                    random.nextInt(99) + 1,
                    random.nextInt(60) + 40,
                    random.nextInt(9) + 1,
                    random.nextInt(5) + 1,
                    Streets[random.nextInt(Streets.length)]);
        }
        return ar;
    }
    public static House[] housesWithCertainNumOfBedrooms(House[] array, int NumOfBedrooms) {
        int numOfSuitableHouses = 0;
        int counter = 0;
        for (House house : array) {
            if (house.getNumOfBedrooms() == NumOfBedrooms) {
                numOfSuitableHouses++;
            }
        }

        House[] ar = new House[numOfSuitableHouses];
        for (House house : array) {
            if (house.getNumOfBedrooms() == NumOfBedrooms) {
                ar[counter++] = house;
            }
        }
        return ar;
    }


    public static House[] housesWithCertainNumOfBedroomsAndFloorRange(House[] array, int NumOfBedrooms, int lowerFloor, int upperFloor) {
        House[] housesWithCerRooms = housesWithCertainNumOfBedrooms(array, NumOfBedrooms);
        int numOfSuitableHouses = 0;
        int counter = 0;
        for (House house : housesWithCerRooms) {
            int floor = house.getFloor();
            if (floor >= lowerFloor && floor <= upperFloor) {
                numOfSuitableHouses++;
            }
        }

        House[] ar = new House[numOfSuitableHouses];

        for (House house : housesWithCerRooms) {
            int floor = house.getFloor();
            if (floor >= lowerFloor && floor <= upperFloor) {
                ar[counter++] = house;
            }
        }

        return ar;
    }
// tried commit trough idea

    public static House[] housesWithLargerArea(House[] array, int minArea){
        int numOfSuitableHouses = 0;
        int counter = 0;
        for (House house : array) {
            if (house.getArea() > minArea) {
                numOfSuitableHouses++;
            }
        }

        House[] ar = new House[numOfSuitableHouses];
        for (House house : array) {
            if (house.getArea() > minArea) {
                ar[counter++] = house;
            }
        }
        return ar;
    }


    public static void printHouseArray(House[] ar){
        for (House house : ar) {
            System.out.println(house.toString());
        }
    }


    public static void main(String[] args) {

        System.out.println();
        int arrSize = 10;
        House[] array = randomHouseArray(arrSize);
        printHouseArray(array);

        System.out.println("\n\n\nFlats with 3 rooms\n");
        House[] flatsWith3Rooms = housesWithCertainNumOfBedrooms(array, 3);
        printHouseArray(flatsWith3Rooms);

        System.out.println("\n\n\nFlats with 3 rooms and 2-4 floor\n");
        House[] flatsWith3RoomsAndFloorRange = housesWithCertainNumOfBedroomsAndFloorRange(array, 3,2,4);
        printHouseArray(flatsWith3RoomsAndFloorRange);

        System.out.println("\n\n\nFlats with 60+ area\n");
        House[] flats = housesWithLargerArea(array, 60);
        printHouseArray(flats);

    }
}

