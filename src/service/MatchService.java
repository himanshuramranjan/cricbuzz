package service;

import model.BallUpdate;
import model.Commentary;
import model.Match;

import java.util.List;

public interface MatchService {

    List<Match> getLiveMatches();
    Match getMatchDetails(String matchId);
    void updateMatchScore(String matchId, BallUpdate update);
    void addCommentary(String matchId, Commentary commentary);
}
