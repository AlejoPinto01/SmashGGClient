package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class Stats {
    private String title;
    private String path;
    private Object[] config;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("config")
    public Object[] getConfig() { return config; }
    @JsonProperty("config")
    public void setConfig(Object[] value) { this.config = value; }
}
