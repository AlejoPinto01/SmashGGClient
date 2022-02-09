package psp.smashggclient.models.player;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class RankingSery {
    private long id;
    private long videogameID;
    private Object sourceID;
    private boolean published;
    private long status;
    private long locationType;
    private String locationName;
    private long locationRadius;
    private String radiusUnit;
    private Object locationID;
    private String name;
    private String slug;
    private Object description;
    private String url;
    private long createdAt;
    private long updatedAt;
    private long createdBy;
    private List<Object> images;
    private String permissionType;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("videogameId")
    public long getVideogameID() { return videogameID; }
    @JsonProperty("videogameId")
    public void setVideogameID(long value) { this.videogameID = value; }

    @JsonProperty("sourceId")
    public Object getSourceID() { return sourceID; }
    @JsonProperty("sourceId")
    public void setSourceID(Object value) { this.sourceID = value; }

    @JsonProperty("published")
    public boolean getPublished() { return published; }
    @JsonProperty("published")
    public void setPublished(boolean value) { this.published = value; }

    @JsonProperty("status")
    public long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(long value) { this.status = value; }

    @JsonProperty("locationType")
    public long getLocationType() { return locationType; }
    @JsonProperty("locationType")
    public void setLocationType(long value) { this.locationType = value; }

    @JsonProperty("locationName")
    public String getLocationName() { return locationName; }
    @JsonProperty("locationName")
    public void setLocationName(String value) { this.locationName = value; }

    @JsonProperty("locationRadius")
    public long getLocationRadius() { return locationRadius; }
    @JsonProperty("locationRadius")
    public void setLocationRadius(long value) { this.locationRadius = value; }

    @JsonProperty("radiusUnit")
    public String getRadiusUnit() { return radiusUnit; }
    @JsonProperty("radiusUnit")
    public void setRadiusUnit(String value) { this.radiusUnit = value; }

    @JsonProperty("locationId")
    public Object getLocationID() { return locationID; }
    @JsonProperty("locationId")
    public void setLocationID(Object value) { this.locationID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("slug")
    public String getSlug() { return slug; }
    @JsonProperty("slug")
    public void setSlug(String value) { this.slug = value; }

    @JsonProperty("description")
    public Object getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Object value) { this.description = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("createdAt")
    public long getCreatedAt() { return createdAt; }
    @JsonProperty("createdAt")
    public void setCreatedAt(long value) { this.createdAt = value; }

    @JsonProperty("updatedAt")
    public long getUpdatedAt() { return updatedAt; }
    @JsonProperty("updatedAt")
    public void setUpdatedAt(long value) { this.updatedAt = value; }

    @JsonProperty("createdBy")
    public long getCreatedBy() { return createdBy; }
    @JsonProperty("createdBy")
    public void setCreatedBy(long value) { this.createdBy = value; }

    @JsonProperty("images")
    public List<Object> getImages() { return images; }
    @JsonProperty("images")
    public void setImages(List<Object> value) { this.images = value; }

    @JsonProperty("permissionType")
    public String getPermissionType() { return permissionType; }
    @JsonProperty("permissionType")
    public void setPermissionType(String value) { this.permissionType = value; }
}
