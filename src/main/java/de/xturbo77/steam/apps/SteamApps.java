package de.xturbo77.steam.apps;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author schmidt
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SteamApps {

    private List<SteamApp> apps;

    public List<SteamApp> getApps() {
        return apps;
    }

    public void setApps(List<SteamApp> apps) {
        this.apps = apps;
    }

    public int size() {
        return apps != null ? apps.size() : 0;
    }

}
