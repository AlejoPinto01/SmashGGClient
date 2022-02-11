package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.ArrayList;

public class Player {
    private long id;
    private String gamerTag;
    private String prefix;
    private Object smashboardsLink;
    private Long smashboardsUserID;
    private Long playerType;
    private Long rank;
    private String color;
    private Long gamerTagChangedAt;
    private Ranking[] rankings;
    private String name;
    private long nameDisplay;
    private ArrayList<Image> images;
    private String state;
    private Country country;
    private PlayerPermissionType permissionType;

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
    public Long getSmashboardsUserID() { return smashboardsUserID; }
    @JsonProperty("smashboardsUserId")
    public void setSmashboardsUserID(Long value) { this.smashboardsUserID = value; }

    @JsonProperty("playerType")
    public Long getPlayerType() { return playerType; }
    @JsonProperty("playerType")
    public void setPlayerType(Long value) { this.playerType = value; }

    @JsonProperty("rank")
    public Long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(Long value) { this.rank = value; }

    @JsonProperty("color")
    public String getColor() { return color; }
    @JsonProperty("color")
    public void setColor(String value) { this.color = value; }

    @JsonProperty("gamerTagChangedAt")
    public Long getGamerTagChangedAt() { return gamerTagChangedAt; }
    @JsonProperty("gamerTagChangedAt")
    public void setGamerTagChangedAt(Long value) { this.gamerTagChangedAt = value; }

    @JsonProperty("rankings")
    public Ranking[] getRankings() { return rankings; }
    @JsonProperty("rankings")
    public void setRankings(Ranking[] value) { this.rankings = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("nameDisplay")
    public long getNameDisplay() { return nameDisplay; }
    @JsonProperty("nameDisplay")
    public void setNameDisplay(long value) { this.nameDisplay = value; }

    @JsonProperty("images")
    public ArrayList<Image> getImages() { return images; }
    @JsonProperty("images")
    public void setImages(ArrayList<Image> value) { this.images = value; }

    @JsonProperty("state")
    public String getState() { return state; }
    @JsonProperty("state")
    public void setState(String value) { this.state = value; }

    @JsonProperty("country")
    public Country getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(Country value) { this.country = value; }

    @JsonProperty("permissionType")
    public PlayerPermissionType getPermissionType() { return permissionType; }
    @JsonProperty("permissionType")
    public void setPermissionType(PlayerPermissionType value) { this.permissionType = value; }

    @Override
    public String toString() {
        return gamerTag;
    }
}
