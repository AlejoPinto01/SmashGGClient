package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class PageConfig {
    private HeaderUnion header;
    private Tabs tabs;
    private Object rules;
    private Matchmaking matchmaking;

    @JsonProperty("header")
    public HeaderUnion getHeader() { return header; }
    @JsonProperty("header")
    public void setHeader(HeaderUnion value) { this.header = value; }

    @JsonProperty("tabs")
    public Tabs getTabs() { return tabs; }
    @JsonProperty("tabs")
    public void setTabs(Tabs value) { this.tabs = value; }

    @JsonProperty("rules")
    public Object getRules() { return rules; }
    @JsonProperty("rules")
    public void setRules(Object value) { this.rules = value; }

    @JsonProperty("matchmaking")
    public Matchmaking getMatchmaking() { return matchmaking; }
    @JsonProperty("matchmaking")
    public void setMatchmaking(Matchmaking value) { this.matchmaking = value; }
}
