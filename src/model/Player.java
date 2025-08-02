package model;

import enums.PlayerRole;

public class Player {
    private String playerId;
    private String name;
    private PlayerRole role;
    private BattingStats battingStats;
    private BowlingStats bowlingStats;

    public Player(String playerId, String name, PlayerRole role, BattingStats battingStats, BowlingStats bowlingStats) {
        this.playerId = playerId;
        this.name = name;
        this.role = role;
        this.battingStats = battingStats;
        this.bowlingStats = bowlingStats;
    }
    // getters and setters omitted for brevity
}
