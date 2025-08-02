package model;

import enums.MatchStatus;
import enums.MatchType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Match {
    private String matchId;
    private MatchType matchType;
    private List<Team> teams = new ArrayList<>();
    private String venue;
    private LocalDateTime startTime;
    private MatchStatus status;
    private Scorecard scorecard = new Scorecard();
    private List<Commentary> commentaryList = new ArrayList<>();

    public void startMatch() { this.status = MatchStatus.LIVE; }
    public void updateScore(BallUpdate update) { scorecard.updateScore(update); }
    public void addCommentary(Commentary commentary) { commentaryList.add(commentary); }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public Scorecard getScorecard() {
        return scorecard;
    }

    public void setScorecard(Scorecard scorecard) {
        this.scorecard = scorecard;
    }

    public List<Commentary> getCommentaryList() {
        return commentaryList;
    }

    public void setCommentaryList(List<Commentary> commentaryList) {
        this.commentaryList = commentaryList;
    }
}
