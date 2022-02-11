package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class EventPublishing {
    private boolean publish;
    private boolean seeding;
    private boolean bracket;
    private boolean deck;

    @JsonProperty("publish")
    public boolean getPublish() { return publish; }
    @JsonProperty("publish")
    public void setPublish(boolean value) { this.publish = value; }

    @JsonProperty("seeding")
    public boolean getSeeding() { return seeding; }
    @JsonProperty("seeding")
    public void setSeeding(boolean value) { this.seeding = value; }

    @JsonProperty("bracket")
    public boolean getBracket() { return bracket; }
    @JsonProperty("bracket")
    public void setBracket(boolean value) { this.bracket = value; }

    @JsonProperty("deck")
    public boolean getDeck() { return deck; }
    @JsonProperty("deck")
    public void setDeck(boolean value) { this.deck = value; }
}
