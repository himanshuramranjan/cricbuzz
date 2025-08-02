package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamId;
    private String teamName;
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) { players.add(player); }
    public List<Player> getPlayers() { return players; }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    // getters and setters omitted for brevity
}
