package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class RankingSery {
    private Long id;
    private Long videogameID;
    private Object sourceID;
    private Boolean published;
    private Long status;
    private Long locationType;
    private String locationName;
    private Long locationRadius;
    private RadiusUnit radiusUnit;
    private Long locationID;
    private String name;
    private String slug;
    private Object description;
    private String url;
    private Long createdAt;
    private Long updatedAt;
    private Long createdBy;
    private List<Image> images;
    private RankingSeryPermissionType permissionType;

    @JsonProperty("id")
    public Long getID() { return id; }
    @JsonProperty("id")
    public void setID(Long value) { this.id = value; }

    @JsonProperty("videogameId")
    public Long getVideogameID() { return videogameID; }
    @JsonProperty("videogameId")
    public void setVideogameID(Long value) { this.videogameID = value; }

    @JsonProperty("sourceId")
    public Object getSourceID() { return sourceID; }
    @JsonProperty("sourceId")
    public void setSourceID(Object value) { this.sourceID = value; }

    @JsonProperty("published")
    public Boolean getPublished() { return published; }
    @JsonProperty("published")
    public void setPublished(Boolean value) { this.published = value; }

    @JsonProperty("status")
    public Long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Long value) { this.status = value; }

    @JsonProperty("locationType")
    public Long getLocationType() { return locationType; }
    @JsonProperty("locationType")
    public void setLocationType(Long value) { this.locationType = value; }

    @JsonProperty("locationName")
    public String getLocationName() { return locationName; }
    @JsonProperty("locationName")
    public void setLocationName(String value) { this.locationName = value; }

    @JsonProperty("locationRadius")
    public Long getLocationRadius() { return locationRadius; }
    @JsonProperty("locationRadius")
    public void setLocationRadius(Long value) { this.locationRadius = value; }

    @JsonProperty("radiusUnit")
    public RadiusUnit getRadiusUnit() { return radiusUnit; }
    @JsonProperty("radiusUnit")
    public void setRadiusUnit(RadiusUnit value) { this.radiusUnit = value; }

    @JsonProperty("locationId")
    public Long getLocationID() { return locationID; }
    @JsonProperty("locationId")
    public void setLocationID(Long value) { this.locationID = value; }

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
    public Long getCreatedAt() { return createdAt; }
    @JsonProperty("createdAt")
    public void setCreatedAt(Long value) { this.createdAt = value; }

    @JsonProperty("updatedAt")
    public Long getUpdatedAt() { return updatedAt; }
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long value) { this.updatedAt = value; }

    @JsonProperty("createdBy")
    public Long getCreatedBy() { return createdBy; }
    @JsonProperty("createdBy")
    public void setCreatedBy(Long value) { this.createdBy = value; }

    @JsonProperty("images")
    public List<Image> getImages() { return images; }
    @JsonProperty("images")
    public void setImages(List<Image> value) { this.images = value; }

    @JsonProperty("permissionType")
    public RankingSeryPermissionType getPermissionType() { return permissionType; }
    @JsonProperty("permissionType")
    public void setPermissionType(RankingSeryPermissionType value) { this.permissionType = value; }
}
