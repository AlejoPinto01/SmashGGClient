package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class TournamentPublishing {
    private boolean publish;
    private boolean live;
    private boolean fantasy;
    private boolean testmode;
    private boolean hideSpectators;
    private boolean registration;
    private boolean attendees;
    private Object[] featureTab;
    private Object[] feedback;
    private String poolsOrdering;
    private boolean hideEntrantCount;

    @JsonProperty("publish")
    public boolean getPublish() { return publish; }
    @JsonProperty("publish")
    public void setPublish(boolean value) { this.publish = value; }

    @JsonProperty("live")
    public boolean getLive() { return live; }
    @JsonProperty("live")
    public void setLive(boolean value) { this.live = value; }

    @JsonProperty("fantasy")
    public boolean getFantasy() { return fantasy; }
    @JsonProperty("fantasy")
    public void setFantasy(boolean value) { this.fantasy = value; }

    @JsonProperty("testmode")
    public boolean getTestmode() { return testmode; }
    @JsonProperty("testmode")
    public void setTestmode(boolean value) { this.testmode = value; }

    @JsonProperty("hide_spectators")
    public boolean getHideSpectators() { return hideSpectators; }
    @JsonProperty("hide_spectators")
    public void setHideSpectators(boolean value) { this.hideSpectators = value; }

    @JsonProperty("registration")
    public boolean getRegistration() { return registration; }
    @JsonProperty("registration")
    public void setRegistration(boolean value) { this.registration = value; }

    @JsonProperty("attendees")
    public boolean getAttendees() { return attendees; }
    @JsonProperty("attendees")
    public void setAttendees(boolean value) { this.attendees = value; }

    @JsonProperty("feature_tab")
    public Object[] getFeatureTab() { return featureTab; }
    @JsonProperty("feature_tab")
    public void setFeatureTab(Object[] value) { this.featureTab = value; }

    @JsonProperty("feedback")
    public Object[] getFeedback() { return feedback; }
    @JsonProperty("feedback")
    public void setFeedback(Object[] value) { this.feedback = value; }

    @JsonProperty("pools_ordering")
    public String getPoolsOrdering() { return poolsOrdering; }
    @JsonProperty("pools_ordering")
    public void setPoolsOrdering(String value) { this.poolsOrdering = value; }

    @JsonProperty("hide_entrant_count")
    public boolean getHideEntrantCount() { return hideEntrantCount; }
    @JsonProperty("hide_entrant_count")
    public void setHideEntrantCount(boolean value) { this.hideEntrantCount = value; }
}
