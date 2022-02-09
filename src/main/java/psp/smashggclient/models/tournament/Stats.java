package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Stats {
    private String title;
    private String path;
    private List<Object> config;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("config")
    public List<Object> getConfig() { return config; }
    @JsonProperty("config")
    public void setConfig(List<Object> value) { this.config = value; }
}
