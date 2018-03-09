package de.xturbo77.steam.news;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author schmidt
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppNewsResponse {

    private AppNews appnews;

    public AppNews getAppnews() {
        return appnews;
    }

    public void setAppnews(AppNews appnews) {
        this.appnews = appnews;
    }

    @Override
    public String toString() {
        return appnews.toString();
    }

}
