package model;

public class BallUpdate {
    private int runs;
    private boolean wicket;
    private int extras;
    private Player batsman;
    private Player bowler;

    public BallUpdate(int runs, boolean wicket, int extras, Player batsman, Player bowler) {
        this.runs = runs;
        this.wicket = wicket;
        this.extras = extras;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public boolean isWicket() {
        return wicket;
    }

    public void setWicket(boolean wicket) {
        this.wicket = wicket;
    }

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }

    public Player getBatsman() {
        return batsman;
    }

    public void setBatsman(Player batsman) {
        this.batsman = batsman;
    }

    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }
}