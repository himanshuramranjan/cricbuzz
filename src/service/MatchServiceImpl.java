package service;

import enums.MatchStatus;
import model.*;
import observer.MatchObserver;
import observer.MatchSubject;

import java.util.ArrayList;
import java.util.List;

public class MatchServiceImpl implements MatchService, MatchSubject {
    private final List<Match> matches = new ArrayList<>();
    private final List<MatchObserver> observers = new ArrayList<>();

    @Override
    public List<Match> getLiveMatches() {
        return matches.stream().filter(m -> m.getStatus() == MatchStatus.LIVE).toList();
    }

    @Override
    public Match getMatchDetails(String matchId) {
        return matches.stream().filter(m -> m.getMatchId().equals(matchId)).findFirst().orElse(null);
    }

    @Override
    public void updateMatchScore(String matchId, BallUpdate update) {
        Match match = getMatchDetails(matchId);
        if (match != null) {
            match.updateScore(update);
            notifyObservers(match);
        }
    }

    @Override
    public void addCommentary(String matchId, Commentary commentary) {
        Match match = getMatchDetails(matchId);
        if (match != null) {
            match.addCommentary(commentary);
            notifyObservers(match);
        }
    }

    public void addMatch(Match match) { matches.add(match); }

    @Override
    public void registerObserver(MatchObserver observer) { observers.add(observer); }
    @Override
    public void removeObserver(MatchObserver observer) { observers.remove(observer); }
    @Override
    public void notifyObservers(Match match) { observers.forEach(o -> o.update(match)); }
}
