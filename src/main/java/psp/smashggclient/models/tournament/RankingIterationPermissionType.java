package psp.smashggclient.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RankingIterationPermissionType {
    RANKING_ITERATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RANKING_ITERATION: return "ranking_iteration";
        }
        return null;
    }

    @JsonCreator
    public static RankingIterationPermissionType forValue(String value) throws IOException {
        if (value.equals("ranking_iteration")) return RANKING_ITERATION;
        throw new IOException("Cannot deserialize RankingIterationPermissionType");
    }
}
