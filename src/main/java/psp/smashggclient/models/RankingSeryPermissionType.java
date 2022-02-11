package psp.smashggclient.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RankingSeryPermissionType {
    RANKING_SERIES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RANKING_SERIES: return "ranking_series";
        }
        return null;
    }

    @JsonCreator
    public static RankingSeryPermissionType forValue(String value) throws IOException {
        if (value.equals("ranking_series")) return RANKING_SERIES;
        throw new IOException("Cannot deserialize RankingSeryPermissionType");
    }
}
