package psp.smashggclient.models;

import com.fasterxml.jackson.annotation.*;

public class AttendeeFieldConfig {
    private NameFirst nameFirst;
    private NameFirst nameLast;
    private NameFirst phoneNumber;

    @JsonProperty("nameFirst")
    public NameFirst getNameFirst() { return nameFirst; }
    @JsonProperty("nameFirst")
    public void setNameFirst(NameFirst value) { this.nameFirst = value; }

    @JsonProperty("nameLast")
    public NameFirst getNameLast() { return nameLast; }
    @JsonProperty("nameLast")
    public void setNameLast(NameFirst value) { this.nameLast = value; }

    @JsonProperty("phoneNumber")
    public NameFirst getPhoneNumber() { return phoneNumber; }
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(NameFirst value) { this.phoneNumber = value; }
}
