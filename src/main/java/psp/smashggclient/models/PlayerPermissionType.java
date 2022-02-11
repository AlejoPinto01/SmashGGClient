package psp.smashggclient.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PlayerPermissionType {
    PLAYER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PLAYER: return "player";
        }
        return null;
    }

    @JsonCreator
    public static PlayerPermissionType forValue(String value) throws IOException {
        if (value.equals("player")) return PLAYER;
        throw new IOException("Cannot deserialize PlayerPermissionType");
    }
}
