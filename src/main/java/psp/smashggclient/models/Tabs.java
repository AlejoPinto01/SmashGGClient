package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Tabs {
    private Stats stats;

    @JsonProperty("stats")
    public Stats getStats() { return stats; }
    @JsonProperty("stats")
    public void setStats(Stats value) { this.stats = value; }
}
