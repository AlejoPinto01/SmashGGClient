package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class Entrant {
    private long id;
    private long eventID;
    private List<Long> participantIDS;
    private Object participant1ID;
    private Object participant2ID;
    private String name;
    private Long finalPlacement;
    private long defaultSkill;
    private Object skill;
    private long skillOrder;
    private boolean unverified;
    private Boolean isDisqualified;
    private Object isPlaceholder;
    private List<Object> expand;
    private Map<String, Long> playerIDS;
    private Long initialSeedNum;
    private Map<String, String> prefixes;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("eventId")
    public long getEventID() { return eventID; }
    @JsonProperty("eventId")
    public void setEventID(long value) { this.eventID = value; }

    @JsonProperty("participantIds")
    public List<Long> getParticipantIDS() { return participantIDS; }
    @JsonProperty("participantIds")
    public void setParticipantIDS(List<Long> value) { this.participantIDS = value; }

    @JsonProperty("participant1Id")
    public Object getParticipant1ID() { return participant1ID; }
    @JsonProperty("participant1Id")
    public void setParticipant1ID(Object value) { this.participant1ID = value; }

    @JsonProperty("participant2Id")
    public Object getParticipant2ID() { return participant2ID; }
    @JsonProperty("participant2Id")
    public void setParticipant2ID(Object value) { this.participant2ID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("finalPlacement")
    public Long getFinalPlacement() { return finalPlacement; }
    @JsonProperty("finalPlacement")
    public void setFinalPlacement(Long value) { this.finalPlacement = value; }

    @JsonProperty("defaultSkill")
    public long getDefaultSkill() { return defaultSkill; }
    @JsonProperty("defaultSkill")
    public void setDefaultSkill(long value) { this.defaultSkill = value; }

    @JsonProperty("skill")
    public Object getSkill() { return skill; }
    @JsonProperty("skill")
    public void setSkill(Object value) { this.skill = value; }

    @JsonProperty("skillOrder")
    public long getSkillOrder() { return skillOrder; }
    @JsonProperty("skillOrder")
    public void setSkillOrder(long value) { this.skillOrder = value; }

    @JsonProperty("unverified")
    public boolean getUnverified() { return unverified; }
    @JsonProperty("unverified")
    public void setUnverified(boolean value) { this.unverified = value; }

    @JsonProperty("isDisqualified")
    public Boolean getIsDisqualified() { return isDisqualified; }
    @JsonProperty("isDisqualified")
    public void setIsDisqualified(Boolean value) { this.isDisqualified = value; }

    @JsonProperty("isPlaceholder")
    public Object getIsPlaceholder() { return isPlaceholder; }
    @JsonProperty("isPlaceholder")
    public void setIsPlaceholder(Object value) { this.isPlaceholder = value; }

    @JsonProperty("expand")
    public List<Object> getExpand() { return expand; }
    @JsonProperty("expand")
    public void setExpand(List<Object> value) { this.expand = value; }

    @JsonProperty("playerIds")
    public Map<String, Long> getPlayerIDS() { return playerIDS; }
    @JsonProperty("playerIds")
    public void setPlayerIDS(Map<String, Long> value) { this.playerIDS = value; }

    @JsonProperty("initialSeedNum")
    public Long getInitialSeedNum() { return initialSeedNum; }
    @JsonProperty("initialSeedNum")
    public void setInitialSeedNum(Long value) { this.initialSeedNum = value; }

    @JsonProperty("prefixes")
    public Map<String, String> getPrefixes() { return prefixes; }
    @JsonProperty("prefixes")
    public void setPrefixes(Map<String, String> value) { this.prefixes = value; }
}
