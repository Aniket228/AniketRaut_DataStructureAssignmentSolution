package com.Question1;
import java.util.List;
import java.util.Stack;

public class BuildingSkyscrapper {
	Stack<Integer> building = new Stack<>();
    int floorSize;
    public BuildingSkyscrapper(int floorSize) {
        this.floorSize = floorSize;
    }

    public void Construct(List<Integer> floors) {
        int floorCount = floorSize;

        for (int day = 1; day <= floorSize; day++) {
            if (floors.get(day-1) == floorCount) {
                System.out.println("\nDay " + day + ":");
                System.out.print(floors.get(day-1));

                while (!building.isEmpty()) {
                    System.out.print(" " + building.pop());
                    floorCount--;
                }

                floorCount--;
            }
            else {
                System.out.println("\nDay " + day + ": ");
                building.push(floors.get(day-1));
            }
        }
    }
}