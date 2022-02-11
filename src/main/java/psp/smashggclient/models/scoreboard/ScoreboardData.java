package psp.smashggclient.models.scoreboard;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ScoreboardData {
    private List<PlayerScoreboard> player;
    private List<String> teamName;
    private List<String> color;
    private List<Long> score;
    private List<String> wl;
    private String bestOf;
    private long gamemode;
    private String round;
    private String tournamentName;
    private List<Caster> caster;
    private boolean allowIntro;
    private boolean workshop;
    private boolean forceHD;
    private boolean noLoAHD;
    private boolean forceMM;

    @JsonProperty("player")
    public List<PlayerScoreboard> getPlayer() { return player; }
    @JsonProperty("player")
    public void setPlayer(List<PlayerScoreboard> value) { this.player = value; }

    @JsonProperty("teamName")
    public List<String> getTeamName() { return teamName; }
    @JsonProperty("teamName")
    public void setTeamName(List<String> value) { this.teamName = value; }

    @JsonProperty("color")
    public List<String> getColor() { return color; }
    @JsonProperty("color")
    public void setColor(List<String> value) { this.color = value; }

    @JsonProperty("score")
    public List<Long> getScore() { return score; }
    @JsonProperty("score")
    public void setScore(List<Long> value) { this.score = value; }

    @JsonProperty("wl")
    public List<String> getWl() { return wl; }
    @JsonProperty("wl")
    public void setWl(List<String> value) { this.wl = value; }

    @JsonProperty("bestOf")
    public String getBestOf() { return bestOf; }
    @JsonProperty("bestOf")
    public void setBestOf(String value) { this.bestOf = value; }

    @JsonProperty("gamemode")
    public long getGamemode() { return gamemode; }
    @JsonProperty("gamemode")
    public void setGamemode(long value) { this.gamemode = value; }

    @JsonProperty("round")
    public String getRound() { return round; }
    @JsonProperty("round")
    public void setRound(String value) { this.round = value; }

    @JsonProperty("tournamentName")
    public String getTournamentName() { return tournamentName; }
    @JsonProperty("tournamentName")
    public void setTournamentName(String value) { this.tournamentName = value; }

    @JsonProperty("caster")
    public List<Caster> getCaster() { return caster; }
    @JsonProperty("caster")
    public void setCaster(List<Caster> value) { this.caster = value; }

    @JsonProperty("allowIntro")
    public boolean getAllowIntro() { return allowIntro; }
    @JsonProperty("allowIntro")
    public void setAllowIntro(boolean value) { this.allowIntro = value; }

    @JsonProperty("workshop")
    public boolean getWorkshop() { return workshop; }
    @JsonProperty("workshop")
    public void setWorkshop(boolean value) { this.workshop = value; }

    @JsonProperty("forceHD")
    public boolean getForceHD() { return forceHD; }
    @JsonProperty("forceHD")
    public void setForceHD(boolean value) { this.forceHD = value; }

    @JsonProperty("noLoAHD")
    public boolean getNoLoAHD() { return noLoAHD; }
    @JsonProperty("noLoAHD")
    public void setNoLoAHD(boolean value) { this.noLoAHD = value; }

    @JsonProperty("forceMM")
    public boolean getForceMM() { return forceMM; }
    @JsonProperty("forceMM")
    public void setForceMM(boolean value) { this.forceMM = value; }
}
