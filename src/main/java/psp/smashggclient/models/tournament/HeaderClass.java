package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class HeaderClass {
    private String title;
    private String subtitle;
    private String bgColor;
    private String titleColor;
    private String subtitleColor;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("subtitle")
    public String getSubtitle() { return subtitle; }
    @JsonProperty("subtitle")
    public void setSubtitle(String value) { this.subtitle = value; }

    @JsonProperty("bgColor")
    public String getBgColor() { return bgColor; }
    @JsonProperty("bgColor")
    public void setBgColor(String value) { this.bgColor = value; }

    @JsonProperty("titleColor")
    public String getTitleColor() { return titleColor; }
    @JsonProperty("titleColor")
    public void setTitleColor(String value) { this.titleColor = value; }

    @JsonProperty("subtitleColor")
    public String getSubtitleColor() { return subtitleColor; }
    @JsonProperty("subtitleColor")
    public void setSubtitleColor(String value) { this.subtitleColor = value; }
}
