package psp.smashggclient.models.scoreboard;

import com.fasterxml.jackson.annotation.*;

public class Caster {
    private String name = "";
    private String twitter = "";
    private String twitch = "";

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("twitter")
    public String getTwitter() { return twitter; }
    @JsonProperty("twitter")
    public void setTwitter(String value) { this.twitter = value; }

    @JsonProperty("twitch")
    public String getTwitch() { return twitch; }
    @JsonProperty("twitch")
    public void setTwitch(String value) { this.twitch = value; }
}
