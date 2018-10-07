package org.itstep.qa.lesson_one.runner;

import org.itstep.qa.lesson_one.zadanie.Drum;

public class RunnerDrum {
    public static void main(String[] args) {
        Drum drum = new Drum(new int[10]);

        drum.getDrumValuesList(new int[]{100,250,350,500,750,850,950,1000,1200,1500});
    }
}
