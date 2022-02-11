package psp.smashggclient.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Country {
    SPAIN, UNITED_STATES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SPAIN: return "Spain";
            case UNITED_STATES: return "United States";
        }
        return null;
    }

    @JsonCreator
    public static Country forValue(String value) throws IOException {
        if (value.equals("Spain")) return SPAIN;
        if (value.equals("United States")) return UNITED_STATES;
        throw new IOException("Cannot deserialize Country");
    }
}
