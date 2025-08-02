package service;

import model.Match;
import observer.MatchObserver;

public class UIObserver implements MatchObserver {
    private final String name;
    public UIObserver(String name) { this.name = name; }
    @Override
    public void update(Match match) {
        System.out.println(name + " -> Live Update: " + match.getMatchId()
                + " Score: " + match.getScorecard().getCurrentInnings().getRuns()
                + "/" + match.getScorecard().getCurrentInnings().getWickets()
                + " in " + match.getScorecard().getCurrentInnings().getOvers() + " overs");
    }
}
