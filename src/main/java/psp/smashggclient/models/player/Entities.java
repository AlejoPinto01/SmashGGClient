package psp.smashggclient.models.player;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Entities {
    private Player player;
    private List<RankingSery> rankingSeries;
    private List<RankingIteration> rankingIteration;

    @JsonProperty("player")
    public Player getPlayer() { return player; }
    @JsonProperty("player")
    public void setPlayer(Player value) { this.player = value; }

    @JsonProperty("rankingSeries")
    public List<RankingSery> getRankingSeries() { return rankingSeries; }
    @JsonProperty("rankingSeries")
    public void setRankingSeries(List<RankingSery> value) { this.rankingSeries = value; }

    @JsonProperty("rankingIteration")
    public List<RankingIteration> getRankingIteration() { return rankingIteration; }
    @JsonProperty("rankingIteration")
    public void setRankingIteration(List<RankingIteration> value) { this.rankingIteration = value; }
}
