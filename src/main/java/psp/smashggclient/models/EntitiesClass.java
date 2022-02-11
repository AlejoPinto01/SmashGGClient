package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;

public class EntitiesClass {
    private Tournament tournament;
    private Phase[] phase;
    private ArrayList<Entrant> entrants;
    private ArrayList<Player> player;
    private RankingSery[] rankingSeries;
    private RankingIteration[] rankingIteration;
    private Event[] event;
    private Videogame[] videogame;

    @JsonProperty("tournament")
    public Tournament getTournament() { return tournament; }
    @JsonProperty("tournament")
    public void setTournament(Tournament value) { this.tournament = value; }

    @JsonProperty("phase")
    public Phase[] getPhase() { return phase; }
    @JsonProperty("phase")
    public void setPhase(Phase[] value) { this.phase = value; }

    @JsonProperty("entrants")
    public ArrayList<Entrant> getEntrants() { return entrants; }
    @JsonProperty("entrants")
    public void setEntrants(ArrayList<Entrant> value) { this.entrants = value; }

    @JsonProperty("player")
    public ArrayList<Player> getPlayer() { return player; }
    @JsonProperty("player")
    public void setPlayer(ArrayList<Player> value) { this.player = value; }

    @JsonProperty("rankingSeries")
    public RankingSery[] getRankingSeries() { return rankingSeries; }
    @JsonProperty("rankingSeries")
    public void setRankingSeries(RankingSery[] value) { this.rankingSeries = value; }

    @JsonProperty("rankingIteration")
    public RankingIteration[] getRankingIteration() { return rankingIteration; }
    @JsonProperty("rankingIteration")
    public void setRankingIteration(RankingIteration[] value) { this.rankingIteration = value; }

    @JsonProperty("event")
    public Event[] getEvent() { return event; }
    @JsonProperty("event")
    public void setEvent(Event[] value) { this.event = value; }

    @JsonProperty("videogame")
    public Videogame[] getVideogame() { return videogame; }
    @JsonProperty("videogame")
    public void setVideogame(Videogame[] value) { this.videogame = value; }
}
