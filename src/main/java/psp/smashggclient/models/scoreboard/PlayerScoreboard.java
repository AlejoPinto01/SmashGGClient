package psp.smashggclient.models.scoreboard;

import com.fasterxml.jackson.annotation.*;

public class PlayerScoreboard {
    private String name;
    private String tag = "";
    private String character;
    private String skin;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("tag")
    public String getTag() { return tag; }
    @JsonProperty("tag")
    public void setTag(String value) { this.tag = value; }

    @JsonProperty("character")
    public String getCharacter() { return character; }
    @JsonProperty("character")
    public void setCharacter(String value) { this.character = value; }

    @JsonProperty("skin")
    public String getSkin() { return skin; }
    @JsonProperty("skin")
    public void setSkin(String value) { this.skin = value; }
}
