package observer;

import model.Match;

public interface MatchSubject {
    void registerObserver(MatchObserver observer);
    void removeObserver(MatchObserver observer);
    void notifyObservers(Match match);
}
