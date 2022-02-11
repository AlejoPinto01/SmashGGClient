package psp.smashggclient.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RadiusUnit {
    KM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case KM: return "km";
        }
        return null;
    }

    @JsonCreator
    public static RadiusUnit forValue(String value) throws IOException {
        if (value.equals("km")) return KM;
        throw new IOException("Cannot deserialize RadiusUnit");
    }
}
