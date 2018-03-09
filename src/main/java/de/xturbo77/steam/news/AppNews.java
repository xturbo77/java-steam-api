package de.xturbo77.steam.news;

import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author schmidt
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppNews {

    private Integer appid;
    private List<AppNewsItem> newsitems;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public List<AppNewsItem> getNewsitems() {
        return newsitems;
    }

    public void setNewsitems(List<AppNewsItem> newsitems) {
        this.newsitems = newsitems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("news for appid: %1$s", getAppid()));
        sb.append("\n");
        for (AppNewsItem i : getNewsitems()) {
            sb.append(i.toString()).append("\n");
        }
        return sb.toString();
    }

}
