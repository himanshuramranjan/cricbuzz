package model;

public class BattingScore {
    private Player player;
    private int runs;
    private int ballsFaced;
    private int fours;
    private int sixes;

    public double getStrikeRate() {
        return ballsFaced == 0 ? 0 : (runs * 100.0) / ballsFaced;
    }
    // getters and setters omitted for brevity


    public Player getPlayer() {
        return player;
    }

    public int getRuns() {
        return runs;
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public int getFours() {
        return fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }
}