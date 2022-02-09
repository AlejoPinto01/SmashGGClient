package psp.smashggclient.models;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;

@JsonDeserialize(using = PlatformID.Deserializer.class)
@JsonSerialize(using = PlatformID.Serializer.class)
public class PlatformID {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<PlatformID> {
        @Override
        public PlatformID deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            PlatformID value = new PlatformID();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize PlatformID");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<PlatformID> {
        @Override
        public void serialize(PlatformID obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("PlatformID must not be null");
        }
    }
}
