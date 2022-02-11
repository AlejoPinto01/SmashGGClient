package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Prizing {
    private long id;
    private long placement;
    private long percent;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("placement")
    public long getPlacement() { return placement; }
    @JsonProperty("placement")
    public void setPlacement(long value) { this.placement = value; }

    @JsonProperty("percent")
    public long getPercent() { return percent; }
    @JsonProperty("percent")
    public void setPercent(long value) { this.percent = value; }
}
