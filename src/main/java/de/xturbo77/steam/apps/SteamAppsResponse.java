package de.xturbo77.steam.apps;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author schmidt
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SteamAppsResponse {

    private SteamApps applist;

    public SteamApps getApplist() {
        return applist;
    }

    public void setApplist(SteamApps applist) {
        this.applist = applist;
    }

}
