package de.xturbo77.steam;

import java.io.IOException;
import java.util.Date;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.deser.std.StdDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Convert unix timestamp to date.
 *
 * @author schmidt
 */
public class TimestampDeserializer extends StdDeserializer<Date> {

    private static final Logger LOG = LoggerFactory.getLogger(TimestampDeserializer.class);

    public TimestampDeserializer() {
        this(null);
    }

    public TimestampDeserializer(Class<?> clazz) {
        super(clazz);
    }

    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        int timestamp = jp.getIntValue();
        LOG.debug("deserialize timestamp {} to date", timestamp);
        return new Date((long) timestamp * 1000);
    }

}
