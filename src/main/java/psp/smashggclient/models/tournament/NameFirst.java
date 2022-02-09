package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class NameFirst {
    private boolean visible;
    private boolean required;

    @JsonProperty("visible")
    public boolean getVisible() { return visible; }
    @JsonProperty("visible")
    public void setVisible(boolean value) { this.visible = value; }

    @JsonProperty("required")
    public boolean getRequired() { return required; }
    @JsonProperty("required")
    public void setRequired(boolean value) { this.required = value; }
}
