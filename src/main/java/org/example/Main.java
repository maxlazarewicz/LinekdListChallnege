package org.example;

import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {

        InteractiveProgram interactiveProgram = new InteractiveProgram();
        LinkedList<Town> places = new LinkedList<Town>();
        ListIterator list_Iter = places.listIterator();
        boolean loop = true;
        boolean exit = false;

        Town sydney = new Town("Sydney", 0);
        Town newcastle = new Town("Newcastle", 161);
        Town brisbane = new Town("Brisbane", 909);
        Town brisbane1 = new Town("Brisbane", 909);

        places.addFirst(sydney);
        places.add(newcastle);
        places.add(brisbane);
        places.add(brisbane1);

       interactiveProgram.program(loop, places, exit);

    }
}