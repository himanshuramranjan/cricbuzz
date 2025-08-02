package model;

import java.util.ArrayList;
import java.util.List;

public class Innings {
    private Team battingTeam;
    private int runs;
    private int wickets;
    private float overs;
    private List<BattingScore> battingScoreList = new ArrayList<>();
    private List<BowlingScore> bowlingScoreList = new ArrayList<>();

    public Team getBattingTeam() { return battingTeam; }
    public void setBattingTeam(Team battingTeam) { this.battingTeam = battingTeam; }

    public List<BattingScore> getBattingScoreList() { return battingScoreList; }
    public List<BowlingScore> getBowlingScoreList() { return bowlingScoreList; }

    public int getRuns() { return runs; }
    public void setRuns(int runs) { this.runs = runs; }

    public int getWickets() { return wickets; }
    public void setWickets(int wickets) { this.wickets = wickets; }

    public float getOvers() { return overs; }
    public void setOvers(float overs) { this.overs = overs; }
}