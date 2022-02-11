package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class Videogame {
    private long id;
    private String abbrev;
    private String name;
    private String displayName;
    private Object minPerEntry;
    private Object maxPerEntry;
    private boolean approved;
    private String slug;
    private boolean isCardGame;
    private Object hasDeckSupport;
    private String characterTerm;
    private String stageTerm;
    private String gameTerm;
    private Object initialStocks;
    private UUID satoriID;
    private long releaseDate;
    private boolean isMultiplayer;
    private String primaryGenre;
    private boolean approvedForOnlineFee;
    private String summary;
    private Image[] images;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("abbrev")
    public String getAbbrev() { return abbrev; }
    @JsonProperty("abbrev")
    public void setAbbrev(String value) { this.abbrev = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("displayName")
    public String getDisplayName() { return displayName; }
    @JsonProperty("displayName")
    public void setDisplayName(String value) { this.displayName = value; }

    @JsonProperty("minPerEntry")
    public Object getMinPerEntry() { return minPerEntry; }
    @JsonProperty("minPerEntry")
    public void setMinPerEntry(Object value) { this.minPerEntry = value; }

    @JsonProperty("maxPerEntry")
    public Object getMaxPerEntry() { return maxPerEntry; }
    @JsonProperty("maxPerEntry")
    public void setMaxPerEntry(Object value) { this.maxPerEntry = value; }

    @JsonProperty("approved")
    public boolean getApproved() { return approved; }
    @JsonProperty("approved")
    public void setApproved(boolean value) { this.approved = value; }

    @JsonProperty("slug")
    public String getSlug() { return slug; }
    @JsonProperty("slug")
    public void setSlug(String value) { this.slug = value; }

    @JsonProperty("isCardGame")
    public boolean getIsCardGame() { return isCardGame; }
    @JsonProperty("isCardGame")
    public void setIsCardGame(boolean value) { this.isCardGame = value; }

    @JsonProperty("hasDeckSupport")
    public Object getHasDeckSupport() { return hasDeckSupport; }
    @JsonProperty("hasDeckSupport")
    public void setHasDeckSupport(Object value) { this.hasDeckSupport = value; }

    @JsonProperty("characterTerm")
    public String getCharacterTerm() { return characterTerm; }
    @JsonProperty("characterTerm")
    public void setCharacterTerm(String value) { this.characterTerm = value; }

    @JsonProperty("stageTerm")
    public String getStageTerm() { return stageTerm; }
    @JsonProperty("stageTerm")
    public void setStageTerm(String value) { this.stageTerm = value; }

    @JsonProperty("gameTerm")
    public String getGameTerm() { return gameTerm; }
    @JsonProperty("gameTerm")
    public void setGameTerm(String value) { this.gameTerm = value; }

    @JsonProperty("initialStocks")
    public Object getInitialStocks() { return initialStocks; }
    @JsonProperty("initialStocks")
    public void setInitialStocks(Object value) { this.initialStocks = value; }

    @JsonProperty("satoriId")
    public UUID getSatoriID() { return satoriID; }
    @JsonProperty("satoriId")
    public void setSatoriID(UUID value) { this.satoriID = value; }

    @JsonProperty("releaseDate")
    public long getReleaseDate() { return releaseDate; }
    @JsonProperty("releaseDate")
    public void setReleaseDate(long value) { this.releaseDate = value; }

    @JsonProperty("isMultiplayer")
    public boolean getIsMultiplayer() { return isMultiplayer; }
    @JsonProperty("isMultiplayer")
    public void setIsMultiplayer(boolean value) { this.isMultiplayer = value; }

    @JsonProperty("primaryGenre")
    public String getPrimaryGenre() { return primaryGenre; }
    @JsonProperty("primaryGenre")
    public void setPrimaryGenre(String value) { this.primaryGenre = value; }

    @JsonProperty("approvedForOnlineFee")
    public boolean getApprovedForOnlineFee() { return approvedForOnlineFee; }
    @JsonProperty("approvedForOnlineFee")
    public void setApprovedForOnlineFee(boolean value) { this.approvedForOnlineFee = value; }

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("images")
    public Image[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Image[] value) { this.images = value; }
}
