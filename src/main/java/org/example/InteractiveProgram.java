package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class InteractiveProgram {

    public void program(boolean loop, LinkedList<Town> places, boolean exit) {
        int position = 0;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            String choice = sc.next();

            switch (choice) {
                case "F":
                    if (position < places.size() - 1) {
                        position++;
                        System.out.println(places.get(position).getPlaceName() + " " +
                                places.get(position).getDistanceFromSydney() + "km");
                    } else {
                        System.out.println("You can not go further");
                    }
                    break;
                case "B":
                    if (position > 0) {
                        position--;
                        System.out.println(places.get(position
                        ).getPlaceName() + " " +
                                places.get(position).getDistanceFromSydney() + "km");
                    } else {
                        System.out.println("You are in first location");
                    }
                    break;
                case "L":
                    for (int j = 0; j < places.size(); j++) {
                        System.out.println(places.get(j).getPlaceName() + " " + places.get(j).getDistanceFromSydney() + "km");
                    }
                    break;
                case "M":
                    System.out.println("F - Further Location");
                    System.out.println("B - Previous Location");
                    System.out.println("M - Show Option Menu");
                    System.out.println("Q - Exit Program");
                    break;
                case "Q":
                    loop = exit;
                    break;
            }
        }
    }
}
