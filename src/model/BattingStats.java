package model;

public class BattingStats {
    private int runs;
    private int ballsFaced;
    private int fours;
    private int sixes;

    public double getStrikeRate() {
        return ballsFaced == 0 ? 0 : (runs * 100.0) / ballsFaced;
    }
    // getters and setters omitted for brevity
}
