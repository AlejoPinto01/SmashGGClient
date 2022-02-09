package psp.smashggclient.models.player;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Tournament {
    private Entities entities;
    private long result;
    private String resultEntity;
    private List<Object> actionRecords;

    @JsonProperty("entities")
    public Entities getEntities() { return entities; }
    @JsonProperty("entities")
    public void setEntities(Entities value) { this.entities = value; }

    @JsonProperty("result")
    public long getResult() { return result; }
    @JsonProperty("result")
    public void setResult(long value) { this.result = value; }

    @JsonProperty("resultEntity")
    public String getResultEntity() { return resultEntity; }
    @JsonProperty("resultEntity")
    public void setResultEntity(String value) { this.resultEntity = value; }

    @JsonProperty("actionRecords")
    public List<Object> getActionRecords() { return actionRecords; }
    @JsonProperty("actionRecords")
    public void setActionRecords(List<Object> value) { this.actionRecords = value; }
}
