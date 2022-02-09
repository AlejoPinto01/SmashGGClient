package psp.smashggclient.models.player;

import com.fasterxml.jackson.annotation.*;

public class Image {
    private long id;
    private long width;
    private long height;
    private double ratio;
    private String type;
    private String url;
    private boolean isOriginal;
    private Object entity;
    private Object entityID;
    private Object uploadedBy;
    private Object createdAt;
    private Object updatedAt;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("width")
    public long getWidth() { return width; }
    @JsonProperty("width")
    public void setWidth(long value) { this.width = value; }

    @JsonProperty("height")
    public long getHeight() { return height; }
    @JsonProperty("height")
    public void setHeight(long value) { this.height = value; }

    @JsonProperty("ratio")
    public double getRatio() { return ratio; }
    @JsonProperty("ratio")
    public void setRatio(double value) { this.ratio = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("isOriginal")
    public boolean getIsOriginal() { return isOriginal; }
    @JsonProperty("isOriginal")
    public void setIsOriginal(boolean value) { this.isOriginal = value; }

    @JsonProperty("entity")
    public Object getEntity() { return entity; }
    @JsonProperty("entity")
    public void setEntity(Object value) { this.entity = value; }

    @JsonProperty("entityId")
    public Object getEntityID() { return entityID; }
    @JsonProperty("entityId")
    public void setEntityID(Object value) { this.entityID = value; }

    @JsonProperty("uploadedBy")
    public Object getUploadedBy() { return uploadedBy; }
    @JsonProperty("uploadedBy")
    public void setUploadedBy(Object value) { this.uploadedBy = value; }

    @JsonProperty("createdAt")
    public Object getCreatedAt() { return createdAt; }
    @JsonProperty("createdAt")
    public void setCreatedAt(Object value) { this.createdAt = value; }

    @JsonProperty("updatedAt")
    public Object getUpdatedAt() { return updatedAt; }
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Object value) { this.updatedAt = value; }
}
