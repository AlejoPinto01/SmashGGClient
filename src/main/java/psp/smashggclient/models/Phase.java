package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Phase {
    private long id;
    private long eventID;
    private long phaseOrder;
    private String name;
    private long state;
    private boolean locked;
    private boolean isDefault;
    private boolean isExhibition;
    private long tier;
    private boolean playGF;
    private Object loserStartDirection;
    private long poolAvoidanceSetting;
    private boolean manualPoolAvoidance;
    private Object bracketInitializer;
    private long groupCount;
    private Object[] bracketMap;
    private boolean canAutoAssign;
    private long createdAt;
    private Object[] groups;
    private boolean checkInEnabled;
    private long bracketType;
    private Object phaseLevel;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("eventId")
    public long getEventID() { return eventID; }
    @JsonProperty("eventId")
    public void setEventID(long value) { this.eventID = value; }

    @JsonProperty("phaseOrder")
    public long getPhaseOrder() { return phaseOrder; }
    @JsonProperty("phaseOrder")
    public void setPhaseOrder(long value) { this.phaseOrder = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("state")
    public long getState() { return state; }
    @JsonProperty("state")
    public void setState(long value) { this.state = value; }

    @JsonProperty("locked")
    public boolean getLocked() { return locked; }
    @JsonProperty("locked")
    public void setLocked(boolean value) { this.locked = value; }

    @JsonProperty("isDefault")
    public boolean getIsDefault() { return isDefault; }
    @JsonProperty("isDefault")
    public void setIsDefault(boolean value) { this.isDefault = value; }

    @JsonProperty("isExhibition")
    public boolean getIsExhibition() { return isExhibition; }
    @JsonProperty("isExhibition")
    public void setIsExhibition(boolean value) { this.isExhibition = value; }

    @JsonProperty("tier")
    public long getTier() { return tier; }
    @JsonProperty("tier")
    public void setTier(long value) { this.tier = value; }

    @JsonProperty("playGF")
    public boolean getPlayGF() { return playGF; }
    @JsonProperty("playGF")
    public void setPlayGF(boolean value) { this.playGF = value; }

    @JsonProperty("loserStartDirection")
    public Object getLoserStartDirection() { return loserStartDirection; }
    @JsonProperty("loserStartDirection")
    public void setLoserStartDirection(Object value) { this.loserStartDirection = value; }

    @JsonProperty("poolAvoidanceSetting")
    public long getPoolAvoidanceSetting() { return poolAvoidanceSetting; }
    @JsonProperty("poolAvoidanceSetting")
    public void setPoolAvoidanceSetting(long value) { this.poolAvoidanceSetting = value; }

    @JsonProperty("manualPoolAvoidance")
    public boolean getManualPoolAvoidance() { return manualPoolAvoidance; }
    @JsonProperty("manualPoolAvoidance")
    public void setManualPoolAvoidance(boolean value) { this.manualPoolAvoidance = value; }

    @JsonProperty("bracketInitializer")
    public Object getBracketInitializer() { return bracketInitializer; }
    @JsonProperty("bracketInitializer")
    public void setBracketInitializer(Object value) { this.bracketInitializer = value; }

    @JsonProperty("groupCount")
    public long getGroupCount() { return groupCount; }
    @JsonProperty("groupCount")
    public void setGroupCount(long value) { this.groupCount = value; }

    @JsonProperty("bracketMap")
    public Object[] getBracketMap() { return bracketMap; }
    @JsonProperty("bracketMap")
    public void setBracketMap(Object[] value) { this.bracketMap = value; }

    @JsonProperty("canAutoAssign")
    public boolean getCanAutoAssign() { return canAutoAssign; }
    @JsonProperty("canAutoAssign")
    public void setCanAutoAssign(boolean value) { this.canAutoAssign = value; }

    @JsonProperty("createdAt")
    public long getCreatedAt() { return createdAt; }
    @JsonProperty("createdAt")
    public void setCreatedAt(long value) { this.createdAt = value; }

    @JsonProperty("groups")
    public Object[] getGroups() { return groups; }
    @JsonProperty("groups")
    public void setGroups(Object[] value) { this.groups = value; }

    @JsonProperty("checkInEnabled")
    public boolean getCheckInEnabled() { return checkInEnabled; }
    @JsonProperty("checkInEnabled")
    public void setCheckInEnabled(boolean value) { this.checkInEnabled = value; }

    @JsonProperty("bracketType")
    public long getBracketType() { return bracketType; }
    @JsonProperty("bracketType")
    public void setBracketType(long value) { this.bracketType = value; }

    @JsonProperty("phaseLevel")
    public Object getPhaseLevel() { return phaseLevel; }
    @JsonProperty("phaseLevel")
    public void setPhaseLevel(Object value) { this.phaseLevel = value; }
}
