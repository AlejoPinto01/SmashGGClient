package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class RankingIteration {
    private long id;
    private long seriesID;
    private String title;
    private String slug;
    private boolean published;
    private long status;
    private boolean active;
    private Object description;
    private long publishedAt;
    private Long startAt;
    private Long endAt;
    private long createdAt;
    private long updatedAt;
    private Long submittedAt;
    private long createdBy;
    private Image[] images;
    private RankingIterationPermissionType permissionType;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("seriesId")
    public long getSeriesID() { return seriesID; }
    @JsonProperty("seriesId")
    public void setSeriesID(long value) { this.seriesID = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("slug")
    public String getSlug() { return slug; }
    @JsonProperty("slug")
    public void setSlug(String value) { this.slug = value; }

    @JsonProperty("published")
    public boolean getPublished() { return published; }
    @JsonProperty("published")
    public void setPublished(boolean value) { this.published = value; }

    @JsonProperty("status")
    public long getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(long value) { this.status = value; }

    @JsonProperty("active")
    public boolean getActive() { return active; }
    @JsonProperty("active")
    public void setActive(boolean value) { this.active = value; }

    @JsonProperty("description")
    public Object getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Object value) { this.description = value; }

    @JsonProperty("publishedAt")
    public long getPublishedAt() { return publishedAt; }
    @JsonProperty("publishedAt")
    public void setPublishedAt(long value) { this.publishedAt = value; }

    @JsonProperty("startAt")
    public Long getStartAt() { return startAt; }
    @JsonProperty("startAt")
    public void setStartAt(Long value) { this.startAt = value; }

    @JsonProperty("endAt")
    public Long getEndAt() { return endAt; }
    @JsonProperty("endAt")
    public void setEndAt(Long value) { this.endAt = value; }

    @JsonProperty("createdAt")
    public long getCreatedAt() { return createdAt; }
    @JsonProperty("createdAt")
    public void setCreatedAt(long value) { this.createdAt = value; }

    @JsonProperty("updatedAt")
    public long getUpdatedAt() { return updatedAt; }
    @JsonProperty("updatedAt")
    public void setUpdatedAt(long value) { this.updatedAt = value; }

    @JsonProperty("submittedAt")
    public Long getSubmittedAt() { return submittedAt; }
    @JsonProperty("submittedAt")
    public void setSubmittedAt(Long value) { this.submittedAt = value; }

    @JsonProperty("createdBy")
    public long getCreatedBy() { return createdBy; }
    @JsonProperty("createdBy")
    public void setCreatedBy(long value) { this.createdBy = value; }

    @JsonProperty("images")
    public Image[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Image[] value) { this.images = value; }

    @JsonProperty("permissionType")
    public RankingIterationPermissionType getPermissionType() { return permissionType; }
    @JsonProperty("permissionType")
    public void setPermissionType(RankingIterationPermissionType value) { this.permissionType = value; }
}
