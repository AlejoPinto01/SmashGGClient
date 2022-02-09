package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Entities {
    private TournamentClass tournament;
    private List<Phase> phase;
    private List<Entrant> entrants;
    private List<Player> player;
    private List<RankingSery> rankingSeries;
    private List<RankingIteration> rankingIteration;
    private List<Event> event;
    private List<Videogame> videogame;

    @JsonProperty("tournament")
    public TournamentClass getTournament() { return tournament; }
    @JsonProperty("tournament")
    public void setTournament(TournamentClass value) { this.tournament = value; }

    @JsonProperty("phase")
    public List<Phase> getPhase() { return phase; }
    @JsonProperty("phase")
    public void setPhase(List<Phase> value) { this.phase = value; }

    @JsonProperty("entrants")
    public List<Entrant> getEntrants() { return entrants; }
    @JsonProperty("entrants")
    public void setEntrants(List<Entrant> value) { this.entrants = value; }

    @JsonProperty("player")
    public List<Player> getPlayer() { return player; }
    @JsonProperty("player")
    public void setPlayer(List<Player> value) { this.player = value; }

    @JsonProperty("rankingSeries")
    public List<RankingSery> getRankingSeries() { return rankingSeries; }
    @JsonProperty("rankingSeries")
    public void setRankingSeries(List<RankingSery> value) { this.rankingSeries = value; }

    @JsonProperty("rankingIteration")
    public List<RankingIteration> getRankingIteration() { return rankingIteration; }
    @JsonProperty("rankingIteration")
    public void setRankingIteration(List<RankingIteration> value) { this.rankingIteration = value; }

    @JsonProperty("event")
    public List<Event> getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(List<Event> value) { this.event = value; }

    @JsonProperty("videogame")
    public List<Videogame> getVideogame() { return videogame; }
    @JsonProperty("videogame")
    public void setVideogame(List<Videogame> value) { this.videogame = value; }
}
