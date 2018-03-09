package de.xturbo77.steam.news;

import de.xturbo77.steam.LoggingFilter;
import de.xturbo77.steam.apps.ISteamAppsClient;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author schmidt
 */
public class ISteamNewsClient {
    private static final Logger LOG = LoggerFactory.getLogger(ISteamAppsClient.class);
    private static final String STEAM_NEWS_SEARCH_ENDPOINT = "https://api.steampowered.com/ISteamNews/GetNewsForApp/v2";

    public AppNewsResponse getNewsForApp(int appid) {
        Client client = ClientBuilder.newClient();
        client.register(new LoggingFilter());
        WebTarget resourceTarget = client.target(STEAM_NEWS_SEARCH_ENDPOINT);
        Invocation invocation = resourceTarget
            .queryParam("appid", appid)
            .request(MediaType.APPLICATION_JSON_TYPE)
            .buildGet();
        AppNewsResponse response = invocation.invoke(AppNewsResponse.class);
        LOG.info("loaded AppNews {} for appid {}", response, appid);
        return response;
    }

}
