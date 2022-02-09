package psp.smashggclient.models.player;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Player {
    private long id;
    private String gamerTag;
    private String prefix;
    private Object smashboardsLink;
    private Object smashboardsUserID;
    private long playerType;
    private long rank;
    private String color;
    private Object gamerTagChangedAt;
    private List<Ranking> rankings;
    private List<Object> expand;
    private String name;
    private long nameDisplay;
    private List<Image> images;
    private Object state;
    private String country;
    private String permissionType;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("gamerTag")
    public String getGamerTag() { return gamerTag; }
    @JsonProperty("gamerTag")
    public void setGamerTag(String value) { this.gamerTag = value; }

    @JsonProperty("prefix")
    public String getPrefix() { return prefix; }
    @JsonProperty("prefix")
    public void setPrefix(String value) { this.prefix = value; }

    @JsonProperty("smashboardsLink")
    public Object getSmashboardsLink() { return smashboardsLink; }
    @JsonProperty("smashboardsLink")
    public void setSmashboardsLink(Object value) { this.smashboardsLink = value; }

    @JsonProperty("smashboardsUserId")
    public Object getSmashboardsUserID() { return smashboardsUserID; }
    @JsonProperty("smashboardsUserId")
    public void setSmashboardsUserID(Object value) { this.smashboardsUserID = value; }

    @JsonProperty("playerType")
    public long getPlayerType() { return playerType; }
    @JsonProperty("playerType")
    public void setPlayerType(long value) { this.playerType = value; }

    @JsonProperty("rank")
    public long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(long value) { this.rank = value; }

    @JsonProperty("color")
    public String getColor() { return color; }
    @JsonProperty("color")
    public void setColor(String value) { this.color = value; }

    @JsonProperty("gamerTagChangedAt")
    public Object getGamerTagChangedAt() { return gamerTagChangedAt; }
    @JsonProperty("gamerTagChangedAt")
    public void setGamerTagChangedAt(Object value) { this.gamerTagChangedAt = value; }

    @JsonProperty("rankings")
    public List<Ranking> getRankings() { return rankings; }
    @JsonProperty("rankings")
    public void setRankings(List<Ranking> value) { this.rankings = value; }

    @JsonProperty("expand")
    public List<Object> getExpand() { return expand; }
    @JsonProperty("expand")
    public void setExpand(List<Object> value) { this.expand = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("nameDisplay")
    public long getNameDisplay() { return nameDisplay; }
    @JsonProperty("nameDisplay")
    public void setNameDisplay(long value) { this.nameDisplay = value; }

    @JsonProperty("images")
    public List<Image> getImages() { return images; }
    @JsonProperty("images")
    public void setImages(List<Image> value) { this.images = value; }

    @JsonProperty("state")
    public Object getState() { return state; }
    @JsonProperty("state")
    public void setState(Object value) { this.state = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    @JsonProperty("permissionType")
    public String getPermissionType() { return permissionType; }
    @JsonProperty("permissionType")
    public void setPermissionType(String value) { this.permissionType = value; }
}
