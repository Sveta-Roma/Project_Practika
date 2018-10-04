package org.itstep.qa.runner;

import org.itstep.qa.zadania.Drum;

public class RunnerDrum {
    public static void main(String[] args) {
        Drum drum = new Drum(new int[10]);

        drum.getDrumValuesList(new int[]{100,250,350,500,750,850,950,1000,1200,1500});
    }
}
