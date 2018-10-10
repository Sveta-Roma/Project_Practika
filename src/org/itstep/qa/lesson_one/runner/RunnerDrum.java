package org.itstep.qa.lesson_one.runner;

import org.itstep.qa.lesson_one.zadanie.Drum;

public class RunnerDrum {
    public static void main(String[] args) {
        //int [] temp = {250,265,852,564,752,740,452,125,658,136};
        //Drum drum = new Drum(temp);

        Drum drum = new Drum(new int[]{250,265,852,564,752,740,452,125,658,136});
        drum.getDrumValuesList();
        System.out.println("Вращайте барабан!");
        drum.runDrum();
        System.out.println("Сектор " + drum.runDrum() + " на барабане");
        System.out.println("Сектор " + drum.runDrum() + " на барабане");
        System.out.println("Сектор " + drum.runDrum() + " на барабане");
    }
}
