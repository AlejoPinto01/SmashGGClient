package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class LimitsByType {
    private long eventMin;

    @JsonProperty("eventMin")
    public long getEventMin() { return eventMin; }
    @JsonProperty("eventMin")
    public void setEventMin(long value) { this.eventMin = value; }
}
