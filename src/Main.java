import enums.MatchType;
import enums.PlayerRole;
import model.*;
import service.MatchServiceImpl;
import service.UIObserver;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        MatchServiceImpl service = new MatchServiceImpl();
        service.registerObserver(new UIObserver("Mobile UI"));
        service.registerObserver(new UIObserver("Web UI"));

        // Create teams
        Team india = new Team();
        india.setTeamId("IND");
        india.setTeamName("India");
        Player rohit = new Player("P1", "Rohit Sharma", PlayerRole.BATSMAN, new BattingStats(), new BowlingStats());
        india.addPlayer(rohit);

        Team australia = new Team();
        australia.setTeamId("AUS");
        australia.setTeamName("Australia");
        Player cummins = new Player("P2", "Pat Cummins", PlayerRole.BOWLER, new BattingStats(), new BowlingStats());
        australia.addPlayer(cummins);

        // Create match
        Match match = new Match();
        match.setMatchId("M1");
        match.setMatchType(MatchType.ODI);
        match.setVenue("Sydney");
        match.setStartTime(LocalDateTime.now());
        match.startMatch();

        // Add innings
        Innings innings = new Innings();
        innings.setBattingTeam(india);
        match.getScorecard().addInnings(innings);

        service.addMatch(match);

        // Update scores
        BallUpdate ball1 = new BallUpdate(4, false, 0, rohit, cummins);
        service.updateMatchScore("M1", ball1);

        BallUpdate ball2 = new BallUpdate(6, false, 0, rohit, cummins);
        service.updateMatchScore("M1", ball2);

        BallUpdate ball3 = new BallUpdate(0, true, 0, rohit, cummins);
        service.updateMatchScore("M1", ball3);
    }
}
