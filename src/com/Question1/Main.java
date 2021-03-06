package com.Question1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	// Driver code
    static Scanner sc = new Scanner(System.in);
    static List<Integer> floors = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println("Enter the total no of floors in the building:");
        int floorSize = sc.nextInt();

        BuildingSkyscrapper skyscraper = new BuildingSkyscrapper(floorSize);

        for (int day=1; day<=floorSize; day++) {
            System.out.println("enter the floor size given on day : " + day);
            floors.add(sc.nextInt());
        }

        skyscraper.Construct(floors);
    }
}