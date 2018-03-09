package de.xturbo77.steam;

import java.io.IOException;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author schmidt
 */
public class LoggingFilter implements ClientRequestFilter {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingFilter.class);

    @Override
    public void filter(ClientRequestContext crc) throws IOException {
        LOG.debug("uri: {}", crc.getUri());
    }

}
