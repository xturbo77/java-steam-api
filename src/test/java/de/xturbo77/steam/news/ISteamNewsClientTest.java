package de.xturbo77.steam.news;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 *
 * @author schmidt
 */

public class ISteamNewsClientTest {

    @Test
    public void testGetAppNews() {
        ISteamNewsClient c = new ISteamNewsClient();
        AppNewsResponse news = c.getNewsForApp(436180);
        Assert.assertNotNull(news);
    }

    public static void main(String[] args) {
        ISteamNewsClientTest test = new ISteamNewsClientTest();
        test.testGetAppNews();
    }
}
