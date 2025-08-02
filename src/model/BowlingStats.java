package model;

public class BowlingStats {
    private float overs;
    private int runsConceded;
    private int wickets;

    public double getEconomy() {
        return overs == 0 ? 0 : (runsConceded / overs);
    }
    // getters and setters omitted for brevity
}
