package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Entities {
    private EntitiesClass entities;
    private long result;
    private String resultEntity;
    private Object[] actionRecords;

    @JsonProperty("entities")
    public EntitiesClass getEntities() { return entities; }
    @JsonProperty("entities")
    public void setEntities(EntitiesClass value) { this.entities = value; }

    @JsonProperty("result")
    public long getResult() { return result; }
    @JsonProperty("result")
    public void setResult(long value) { this.result = value; }

    @JsonProperty("resultEntity")
    public String getResultEntity() { return resultEntity; }
    @JsonProperty("resultEntity")
    public void setResultEntity(String value) { this.resultEntity = value; }

    @JsonProperty("actionRecords")
    public Object[] getActionRecords() { return actionRecords; }
    @JsonProperty("actionRecords")
    public void setActionRecords(Object[] value) { this.actionRecords = value; }
}
