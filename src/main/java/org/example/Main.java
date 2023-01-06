package org.example;

import java.util.Collections;
import java.util.Comparator;
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
        Town adelaide = new Town("Ade", 100);
        Town perth = new Town("perth", 777);




        places.addFirst(sydney);
        places.add(newcastle);
        places.add(brisbane);
        places.add(brisbane1);
        places.add(adelaide);
        places.add(perth);


        Collections.sort(places, new Comparator<Town>() {
            @Override
            public int compare(Town o1, Town o2) {
                return o1.getDistanceFromSydney() - o2.getDistanceFromSydney();
            }
        });

       interactiveProgram.program(loop, places, exit);

    }
}