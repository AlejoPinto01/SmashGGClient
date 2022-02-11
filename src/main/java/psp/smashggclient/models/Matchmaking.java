package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Matchmaking {
    private String stationNoun;
    private boolean usesCards;
    private String checkInLocation;
    private String unregisteredMessage;
    private String playLocation;
    private Object prizingInfo;

    @JsonProperty("stationNoun")
    public String getStationNoun() { return stationNoun; }
    @JsonProperty("stationNoun")
    public void setStationNoun(String value) { this.stationNoun = value; }

    @JsonProperty("usesCards")
    public boolean getUsesCards() { return usesCards; }
    @JsonProperty("usesCards")
    public void setUsesCards(boolean value) { this.usesCards = value; }

    @JsonProperty("checkInLocation")
    public String getCheckInLocation() { return checkInLocation; }
    @JsonProperty("checkInLocation")
    public void setCheckInLocation(String value) { this.checkInLocation = value; }

    @JsonProperty("unregisteredMessage")
    public String getUnregisteredMessage() { return unregisteredMessage; }
    @JsonProperty("unregisteredMessage")
    public void setUnregisteredMessage(String value) { this.unregisteredMessage = value; }

    @JsonProperty("playLocation")
    public String getPlayLocation() { return playLocation; }
    @JsonProperty("playLocation")
    public void setPlayLocation(String value) { this.playLocation = value; }

    @JsonProperty("prizingInfo")
    public Object getPrizingInfo() { return prizingInfo; }
    @JsonProperty("prizingInfo")
    public void setPrizingInfo(Object value) { this.prizingInfo = value; }
}
