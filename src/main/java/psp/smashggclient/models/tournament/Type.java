package psp.smashggclient.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Type {
    BANNER, ICON, PRIMARY, PRIMARY_QUALITY, PROFILE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANNER: return "banner";
            case ICON: return "icon";
            case PRIMARY: return "primary";
            case PRIMARY_QUALITY: return "primary-quality";
            case PROFILE: return "profile";
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(String value) throws IOException {
        if (value.equals("banner")) return BANNER;
        if (value.equals("icon")) return ICON;
        if (value.equals("primary")) return PRIMARY;
        if (value.equals("primary-quality")) return PRIMARY_QUALITY;
        if (value.equals("profile")) return PROFILE;
        throw new IOException("Cannot deserialize Type");
    }
}
