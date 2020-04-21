package ActivityTracker.Models;

import java.util.Random;


public class HeartMonitor {

    private int heartRate;

    public int getHeartRate() {
        heartRate = generateRandomIntIntRange(60, 75);
        return heartRate;
    }

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }



}
