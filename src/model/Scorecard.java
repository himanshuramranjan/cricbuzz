package model;

import java.util.ArrayList;
import java.util.List;
public class Scorecard {
    private List<Innings> inningsList = new ArrayList<>();

    public void addInnings(Innings innings) { inningsList.add(innings); }
    public Innings getCurrentInnings() { return inningsList.isEmpty() ? null : inningsList.get(inningsList.size() - 1); }

    public void updateScore(BallUpdate update) {
        Innings innings = getCurrentInnings();
        if (innings == null) return;

        // Update team score
        innings.setRuns(innings.getRuns() + update.getRuns() + update.getExtras());
        if (update.isWicket()) innings.setWickets(innings.getWickets() + 1);

        // Update overs
        float overs = innings.getOvers();
        int balls = (int)((overs - (int)overs) * 10);
        balls++;
        if (balls == 6) {
            innings.setOvers((int)overs + 1);
        } else {
            innings.setOvers((int)overs + balls / 10.0f);
        }

        // Update batsman stats
        BattingScore battingScore = innings.getBattingScoreList().stream()
                .filter(bs -> bs.getPlayer().equals(update.getBatsman()))
                .findFirst()
                .orElseGet(() -> {
                    BattingScore newScore = new BattingScore();
                    newScore.setPlayer(update.getBatsman());
                    innings.getBattingScoreList().add(newScore);
                    return newScore;
                });
        battingScore.setRuns(battingScore.getRuns() + update.getRuns());
        battingScore.setBallsFaced(battingScore.getBallsFaced() + 1);
        if (update.getRuns() == 4) battingScore.setFours(battingScore.getFours() + 1);
        if (update.getRuns() == 6) battingScore.setSixes(battingScore.getSixes() + 1);

        // Update bowler stats
        BowlingScore bowlingScore = innings.getBowlingScoreList().stream()
                .filter(bs -> bs.getPlayer().equals(update.getBowler()))
                .findFirst()
                .orElseGet(() -> {
                    BowlingScore newScore = new BowlingScore();
                    newScore.setPlayer(update.getBowler());
                    innings.getBowlingScoreList().add(newScore);
                    return newScore;
                });
        bowlingScore.setRunsConceded(bowlingScore.getRunsConceded() + update.getRuns());
        if (update.isWicket()) bowlingScore.setWickets(bowlingScore.getWickets() + 1);
        bowlingScore.setOvers(bowlingScore.getOvers() + (1 / 6f));
    }
}
