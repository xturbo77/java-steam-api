package de.xturbo77.steam.news;

import de.xturbo77.steam.TimestampDeserializer;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

/**
 *
 * @author schmidt
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppNewsItem {

    private Integer appid;
    private String gid;
    private String title;
    private String url;
    private boolean is_external_url;
    private String author;
    private String feedlabel;
    @JsonDeserialize(using = TimestampDeserializer.class)
    private Date date;
    private String feedname;
    private String contents;

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isIs_external_url() {
        return is_external_url;
    }

    public void setIs_external_url(boolean is_external_url) {
        this.is_external_url = is_external_url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedlabel() {
        return feedlabel;
    }

    public void setFeedlabel(String feedlabel) {
        this.feedlabel = feedlabel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFeedname() {
        return feedname;
    }

    public void setFeedname(String feedname) {
        this.feedname = feedname;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return String.format("Date: %2$tD, Title: %1$s", getTitle(), getDate());
    }

}
