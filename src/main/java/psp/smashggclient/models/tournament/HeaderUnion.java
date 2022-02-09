package psp.smashggclient.models;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import java.util.List;

@JsonDeserialize(using = HeaderUnion.Deserializer.class)
@JsonSerialize(using = HeaderUnion.Serializer.class)
public class HeaderUnion {
    public List<Object> anythingArrayValue;
    public HeaderClass headerClassValue;

    static class Deserializer extends JsonDeserializer<HeaderUnion> {
        @Override
        public HeaderUnion deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            HeaderUnion value = new HeaderUnion();
            switch (jsonParser.currentToken()) {
                case START_ARRAY:
                    value.anythingArrayValue = jsonParser.readValueAs(new TypeReference<List<Object>>() {});
                    break;
                case START_OBJECT:
                    value.headerClassValue = jsonParser.readValueAs(HeaderClass.class);
                    break;
                default: throw new IOException("Cannot deserialize HeaderUnion");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<HeaderUnion> {
        @Override
        public void serialize(HeaderUnion obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.anythingArrayValue != null) {
                jsonGenerator.writeObject(obj.anythingArrayValue);
                return;
            }
            if (obj.headerClassValue != null) {
                jsonGenerator.writeObject(obj.headerClassValue);
                return;
            }
            throw new IOException("HeaderUnion must not be null");
        }
    }
}
