package de.xturbo77.steam.news;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author schmidt
 */
@Test
public class ISteamNewsClientTest {

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
