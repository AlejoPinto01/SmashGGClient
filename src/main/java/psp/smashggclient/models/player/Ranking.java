package psp.smashggclient.models.player;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Ranking {
    private long id;
    private long iterationID;
    private long rank;
    private List<Long> characterMains;
    private Object description;
    private long publishedAt;
    private boolean active;
    private long seriesID;
    private long videogameID;
    private long sourceID;
    private long delta;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("iterationId")
    public long getIterationID() { return iterationID; }
    @JsonProperty("iterationId")
    public void setIterationID(long value) { this.iterationID = value; }

    @JsonProperty("rank")
    public long getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(long value) { this.rank = value; }

    @JsonProperty("characterMains")
    public List<Long> getCharacterMains() { return characterMains; }
    @JsonProperty("characterMains")
    public void setCharacterMains(List<Long> value) { this.characterMains = value; }

    @JsonProperty("description")
    public Object getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(Object value) { this.description = value; }

    @JsonProperty("publishedAt")
    public long getPublishedAt() { return publishedAt; }
    @JsonProperty("publishedAt")
    public void setPublishedAt(long value) { this.publishedAt = value; }

    @JsonProperty("active")
    public boolean getActive() { return active; }
    @JsonProperty("active")
    public void setActive(boolean value) { this.active = value; }

    @JsonProperty("seriesId")
    public long getSeriesID() { return seriesID; }
    @JsonProperty("seriesId")
    public void setSeriesID(long value) { this.seriesID = value; }

    @JsonProperty("videogameId")
    public long getVideogameID() { return videogameID; }
    @JsonProperty("videogameId")
    public void setVideogameID(long value) { this.videogameID = value; }

    @JsonProperty("sourceId")
    public long getSourceID() { return sourceID; }
    @JsonProperty("sourceId")
    public void setSourceID(long value) { this.sourceID = value; }

    @JsonProperty("delta")
    public long getDelta() { return delta; }
    @JsonProperty("delta")
    public void setDelta(long value) { this.delta = value; }
}
