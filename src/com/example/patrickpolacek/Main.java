package com.example.patrickpolacek;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Simulation simulation = new Simulation();

        ArrayList<Item> phase1Item = simulation.loadItems(new File("C:\\Program Files\\IntelliJavaProjects\\SpaceChallenge-master\\src\\phase-1.txt"));

        ArrayList<Item> phase2Item = simulation.loadItems(new File("C:\\Program Files\\IntelliJavaProjects\\SpaceChallenge-master\\src\\phase-2.txt"));



        ArrayList<Rocket> phase1Rockets = simulation.loadU1(phase1Item);

        ArrayList<Rocket> phase2Rockets =simulation.loadU2(phase1Item);

        System.out.println(phase1Rockets);

        System.out.println(Arrays.deepToString(phase1Rockets.toArray()));
        System.out.println(Arrays.deepToString(phase2Rockets.toArray()));

//        System.out.println("The cost of this mission in phase1 is: " + simulation.runSimulation(phase1Rockets));
//
//        System.out.println("The cost of this mission in phase2 is: " + simulation.runSimulation(phase2Rockets));

    }
}
